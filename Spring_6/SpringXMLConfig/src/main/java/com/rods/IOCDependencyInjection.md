
---

# Configuring the Containers using Spring (XML Format) and the Concept of Beans

## 1. Spring Container and Beans

* The **Spring Container** is responsible for creating, managing, and configuring objects (called **beans**) in a Spring application.
* A **bean** is simply an object that is managed by the Spring IoC (Inversion of Control) container.
* In XML configuration, beans are defined inside the `applicationContext.xml` (or any custom XML file).

### Example of a Bean in XML:

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans 
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- Defining a bean -->
    <bean id="studentBean" class="com.example.Student" scope="singleton" lazy-init="false">
        <property name="name" value="John Doe"/>
        <property name="age" value="22"/>
    </bean>
</beans>
```

### Key Attributes of `<bean>` Tag:

* **id** → Unique identifier of the bean.
* **class** → Fully qualified class name of the bean.
* **scope** → Defines the lifecycle (`singleton`, `prototype`, `request`, `session`).
* **lazy-init** → If `true`, the bean will be created only when it’s first requested. Default is `false` (eager initialization).

---

## 2. Inversion of Control (IoC) and Dependency Injection (DI)

### Inversion of Control (IoC)

* Traditional Java applications create objects using `new`. This makes code tightly coupled.
* In **IoC**, the control of object creation and binding is shifted to the **Spring container**.
* The container creates objects, manages their lifecycle, and injects dependencies wherever needed.

### Dependency Injection (DI)

* **DI** is the process of supplying the dependencies of an object from outside the class, rather than creating them inside.
* Achieved in Spring mainly via:

    1. **Setter Injection** (`<property>` tag)
    2. **Constructor Injection** (`<constructor-arg>` tag)
    3. **Autowiring** (automatic wiring of beans by Spring container)

---

## 3. Dependency Injection in XML

### (A) Setter Injection Example:

```xml
<bean id="addressBean" class="com.example.Address">
    <property name="city" value="Mumbai"/>
    <property name="state" value="Maharashtra"/>
</bean>

<bean id="studentBean" class="com.example.Student">
    <property name="name" value="Rahul"/>
    <property name="address" ref="addressBean"/>
</bean>
```

* `value` → Injects a literal value.
* `ref` → Injects a reference to another bean.

### (B) Constructor Injection Example:

```xml
<bean id="addressBean" class="com.example.Address">
    <constructor-arg value="Delhi"/>
    <constructor-arg value="India"/>
</bean>

<bean id="studentBean" class="com.example.Student">
    <constructor-arg value="Amit"/>
    <constructor-arg ref="addressBean"/>
</bean>
```

---

## 4. Autowiring in Spring (XML-based)

Spring can automatically wire beans without explicit `<property>` or `<constructor-arg>`.

### Autowire Modes:

* **byName** → Matches bean name with property name.
* **byType** → Matches bean by type.
* **constructor** → Chooses constructor for injection based on parameter types.
* **autodetect** (deprecated) → Detects constructor or byType automatically.
* **no** → Default, no autowiring.

### Example:

```xml
<bean id="addressBean" class="com.example.Address"/>

<bean id="studentBean" class="com.example.Student" autowire="byName"/>
```

* If `Student` has a property `address`, Spring will look for a bean named `address` or `addressBean`.

---

## 5. Important Bean Configuration Tags

1. **`<property>`** → For setter injection.
2. **`<constructor-arg>`** → For constructor injection.
3. **`<bean lazy-init="true">`** → To enable lazy initialization.
4. **`<bean scope="singleton|prototype">`** → To configure scope.
5. **`<import>`** → To include multiple XML files into a central configuration.

   ```xml
   <import resource="student-beans.xml"/>
   <import resource="teacher-beans.xml"/>
   ```
6. **`<alias>`** → To give another name to a bean.

   ```xml
   <alias name="studentBean" alias="stud"/>
   ```

---

## 6. Lazy Initialization (`lazy-init`)

* By default, all beans are **eagerly created** at startup.
* Setting `lazy-init="true"` delays creation until the bean is first requested.
* Useful for performance optimization when a bean is rarely used.

Example:

```xml
<bean id="heavyBean" class="com.example.BigObject" lazy-init="true"/>
```

---

## 7. Putting it all Together – Example

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- Address Bean -->
    <bean id="addressBean" class="com.example.Address">
        <property name="city" value="Pune"/>
        <property name="state" value="Maharashtra"/>
    </bean>

    <!-- Student Bean with Setter Injection and Autowire -->
    <bean id="studentBean" class="com.example.Student" autowire="byType" scope="singleton" lazy-init="false">
        <property name="name" value="Suresh"/>
    </bean>

    <!-- Teacher Bean with Constructor Injection -->
    <bean id="teacherBean" class="com.example.Teacher">
        <constructor-arg value="Prof. Sharma"/>
        <constructor-arg ref="addressBean"/>
    </bean>

</beans>
```

---

# **Summary**

* Spring IoC container manages objects (beans).
* Beans are configured in **XML** with `<bean>`, `<property>`, and `<constructor-arg>`.
* **Dependency Injection** can be done via setter, constructor, or autowiring.
* **Inversion of Control** shifts object creation to Spring container.
* Important attributes include **scope**, **lazy-init**, **autowire**, **ref**, and **value**.
* Tags like `<import>`, `<alias>`, and `<bean>` make configuration modular and flexible.

---
