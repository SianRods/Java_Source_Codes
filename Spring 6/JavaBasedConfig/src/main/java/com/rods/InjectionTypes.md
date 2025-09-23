# Types of Injection Methods in Spring — detailed note

---

## 1) Quick overview

Dependency Injection means the container (Spring) provides an object’s dependencies rather than the object creating them itself. Spring supports several *ways* to inject dependencies:

* **Constructor injection**
* **Setter (or property) injection**
* **Field injection** (annotation-based)
* **Method injection / Lookup injection** (special use cases)
* **Injection of simple values and collections** (strings, primitives, lists, maps)
* Injection configuration styles: **XML**, **Java @Configuration + @Bean**, **annotation-based component scanning** (`@Component`, `@Service`, `@Repository`, `@Controller` with `@Autowired`, etc.)

---

## 2) Constructor injection

**What:** Dependencies are provided through a class constructor.

**How (example):**

```java
@Component
public class OrderService {
    private final PaymentGateway paymentGateway;
    public OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
}
```

With Spring Boot / modern Spring, `@Autowired` on constructor is optional if the class has a single constructor.

**Pros**

* Promotes immutability (`final` fields).
* Makes required dependencies explicit.
* Safer for testing (easy to supply mocks).
* Avoids partially-initialized beans — good for mandatory dependencies.

**Cons**

* For many optional dependencies, constructors can become large (but that usually signals design smells).

**Circular dependencies:** Constructor injection cannot resolve circular dependencies (A needs B and B needs A) — Spring will fail with a circular reference error for constructor-based cycles.

---

## 3) Setter (property) injection

**What:** Dependencies are provided via setter methods or JavaBean-style properties.

**How (example):**

```java
@Component
public class InvoiceService {
    private PaymentGateway paymentGateway;

    @Autowired         // can be on setter
    public void setPaymentGateway(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
}
```

**Pros**

* Supports optional dependencies easily (you can omit calling the setter).
* Works for mutable properties.

**Cons**

* Objects can be partially constructed and in inconsistent state if setters aren’t called.
* Less favorable for immutability and thread-safety.

**Circular dependencies:** Setter injection *can* allow circular dependencies because Spring can instantiate beans and then call setters to wire them.

---

## 4) Field injection (annotation on fields)

**What:** Spring injects directly into a field (no constructor/setter required).

**How (example):**

```java
@Component
public class ReportService {
    @Autowired
    private DataSource dataSource;
}
```

You can also use `@Inject` (JSR-330) or `@Resource` (JSR-250).

**Pros**

* Very concise — minimal boilerplate.

**Cons**

* Hinders testability (harder to construct instance with mocks without reflection or Spring test support).
* Breaks encapsulation.
* Makes dependencies less explicit.
* Many consider it an anti-pattern for production code (acceptable in small prototypes).

---

## 5) Method injection / Lookup method injection

**What:** A Spring technique to inject dependencies via a method call — used in special cases (for example when a singleton needs to return prototype-scoped bean instances each time).

**Lookup method example (classic XML or `@Lookup`):**

```java
@Component
public abstract class TaskExecutor {
    @Lookup
    protected abstract PrototypeWorker getWorker();

    public void execute() {
        PrototypeWorker worker = getWorker(); // Spring provides a new prototype instance
        worker.doWork();
    }
}
```

**Use case:** When a singleton-scoped bean needs fresh `prototype` instances.

**Pros/Cons:** Very specialized; use only when required.

---

## 6) Injection of primitive values, collections and maps

**Simple values**

* Use `@Value` to inject strings/primitives from properties or literals:

```java
@Value("${service.timeout:30}")
private int timeout; // default 30 if property missing
```

**Collections / Maps**

* Spring can inject lists, sets, maps of beans or of simple values. In `@Configuration` methods or XML you can create and inject collections. Example for multiple beans:

```java
@Autowired
private List<PaymentProcessor> processors; // injected in ordered list of beans
```

---

## 7) Annotation types & qualifiers (resolving multiple beans)

If multiple beans implement the same type, you must disambiguate:

* `@Primary` on a bean to make it default.
* `@Qualifier("beanName")` or `@Qualifier` with custom qualifier annotation.
* `@Resource(name="beanName")` resolves by name (JSR-250).

Example:

```java
@Component("fast")
public class FastPayment implements PaymentGateway {}

@Component("secure")
public class SecurePayment implements PaymentGateway {}

@Autowired
@Qualifier("secure")
private PaymentGateway gateway;
```

---

## 8) XML, Java Config (`@Bean`) and annotation scanning examples

**XML constructor injection**

```xml
<bean id="orderService" class="com.example.OrderService">
  <constructor-arg ref="paymentGateway"/>
</bean>
```

**XML setter injection**

```xml
<bean id="invoiceService" class="com.example.InvoiceService">
  <property name="paymentGateway" ref="paymentGateway"/>
</bean>
```

**Java @Configuration + @Bean**

```java
@Configuration
public class AppConfig {
    @Bean
    public PaymentGateway paymentGateway() { return new StripePaymentGateway(); }

    @Bean
    public OrderService orderService(PaymentGateway paymentGateway) {
        return new OrderService(paymentGateway); // constructor injection
    }
}
```

**Annotation scanning**

```java
@Service
public class OrderService {
    private final PaymentGateway gateway;
    public OrderService(PaymentGateway gateway) { this.gateway = gateway; } // auto-wired
}
```

Ensure `@ComponentScan` or Spring Boot auto-configuration picks them up.

---

## 9) Circular dependencies — how Spring behaves

* **Setter (and field) injection**: Spring can resolve circular references by creating bean instances first and later injecting properties (default behavior for prototype vs singleton differences apply).
* **Constructor injection**: Cannot resolve circular dependencies — you’ll get a `BeanCurrentlyInCreationException`.
* **Workarounds**: Refactor to remove cycle, introduce a third bean to break dependency, use `ObjectFactory<T>` or `Provider<T>` for lazy injection, or `@Lazy` injection.

Example with `ObjectFactory`:

```java
@Autowired
private ObjectFactory<OtherService> otherServiceFactory;

public void doIt() {
    OtherService other = otherServiceFactory.getObject();
}
```

---

## 10) Best practices / recommendations

* Prefer **constructor injection** for mandatory dependencies — it makes dependencies explicit and supports immutability and testing.
* Use **setter injection** for optional/mutable dependencies.
* **Avoid field injection** in production code (makes unit testing and code clarity harder).
* Use `@Qualifier`/`@Primary` to disambiguate multiple candidates.
* Keep beans small and cohesive — many dependencies often point to design needing refactor.
* Prefer `@Configuration` + `@Bean` for advanced wiring or when creating third-party library instances.
* For prototype beans used by singletons, use `@Lookup`, `ObjectFactory`, or `Provider` to get fresh instances.
* Use `@Value` for configuration properties and externalize configuration (application.properties / YAML).

---

## 11) Quick comparison table

| Injection Type  |                              Syntax | Good for                    |     Immutability | Circular deps        |
| --------------- | ----------------------------------: | --------------------------- | ---------------: | -------------------- |
| Constructor     | Constructor args / @Autowired cons. | Required deps               | ✅ (final fields) | ❌ not supported      |
| Setter          |           Setter methods / property | Optional deps               |                ❌ | ✅ supported          |
| Field           |              `@Autowired` on fields | Prototypes, quick wiring    |                ❌ | ✅ supported          |
| Method / Lookup |          `@Lookup` / factory method | Singleton needing prototype |          depends | ✅ (special handling) |

---

## 12) Small checklist when deciding

1. Is the dependency required? → Constructor injection.
2. Is it optional or can be changed later? → Setter injection.
3. Do you need new instances per use (prototype) inside a singleton? → Use `@Lookup` or `ObjectFactory`/`Provider`.
4. Multiple beans of same type? → Use `@Qualifier` or `@Primary`.
5. Want easy unit tests without Spring context? → Constructor injection makes it easiest.

---

## 13) Example: full small class with constructor + collection + qualifier

```java
@Component
public class CheckoutService {
    private final PaymentGateway paymentGateway;
    private final List<Promotion> promotions;

    public CheckoutService(@Qualifier("stripe") PaymentGateway paymentGateway,
                           List<Promotion> promotions) {
        this.paymentGateway = paymentGateway;
        this.promotions = promotions; // all Promotion beans injected
    }
}
```

---

## 14) Final notes

Spring gives you flexible options — use them deliberately. Constructor-first, setter-for-optionals, avoid field injection in production, and use qualifiers or configuration when ambiguity arises. When you hit circular dependency issues, refactor first — usually that reveals a better design.

If you want, I can:

* Provide **sample project skeleton** (Maven/Gradle) with examples of each injection style, or
* Show **unit test examples** demonstrating how to mock/inject dependencies cleanly for each method.
