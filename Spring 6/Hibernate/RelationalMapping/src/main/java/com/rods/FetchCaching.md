

## **Fetch Types in Hibernate**

### 1. **Lazy Fetching (Default)**

* Objects are **not loaded from the database immediately**.
* Only a **proxy object** (placeholder) is created, and the actual data is fetched **on demand** (when the property/method is accessed).
* Helps in performance optimization when you don’t always need the associated data.
* Example:

  ```java
  @OneToMany(fetch = FetchType.LAZY)
  private List<Course> courses;
  ```

  Here, `courses` will not be fetched until you explicitly access it.

⚠️ Caveat: Lazy loading needs an **open Hibernate session** (else you get `LazyInitializationException`).

---

### 2. **Eager Fetching**

* Associated objects are **fetched immediately** along with the parent entity.
* Means a **JOIN query** is executed in the background.
* Can be wasteful if you don’t always need the extra data.
* Example:

  ```java
  @OneToMany(fetch = FetchType.EAGER)
  private List<Course> courses;
  ```

---

## **Caching in Hibernate**

Hibernate uses caching to reduce database hits and improve performance.

### 1. **First-Level Cache (L1 Cache)**

* **Enabled by default.**
* Scope: **Session-level cache**.
* Each Hibernate session has its own cache.
* If you load the same entity multiple times in one session, Hibernate fetches it **only once from the DB**; subsequent calls return the cached object.
* Example:

  ```java
  Session session = sessionFactory.openSession();
  Student s1 = session.get(Student.class, 1); // hits DB
  Student s2 = session.get(Student.class, 1); // served from L1 cache
  ```

---

### 2. **Second-Level Cache (L2 Cache)**

* **Optional**, needs to be explicitly enabled.
* Scope: **SessionFactory-level cache** (shared across sessions).
* Stores entities, collections, or queries.
* Requires a caching provider like **Ehcache, Infinispan, Redis, etc.**
* Example use: Frequently accessed reference data (like countries, product categories).

---

### 3. **Query Cache**

* Separate from entity cache.
* Stores results of **HQL/Criteria queries**.
* Needs L2 cache + query cache to be enabled.
* Example:

  ```java
  Query query = session.createQuery("from Student");
  query.setCacheable(true);
  ```

---

## ✅ Summary

* **Lazy fetch**: loads data only when accessed → better performance, but watch for `LazyInitializationException`.
* **Eager fetch**: loads all associated data immediately → simpler but heavier on DB.
* **L1 cache**: Session-specific, always enabled.
* **L2 cache**: Shared across sessions, needs configuration.
* **Query cache**: Stores query results, requires L2 cache enabled.

* `@OneToOne` and `@ManyToOne` → **EAGER**
* `@OneToMany` and `@ManyToMany` → **LAZY**

If you want to **override the default and make it EAGER**, you explicitly set it like this:

---

### **Examples**

#### 1. One-to-Many (default is LAZY → change to EAGER)

```java
@Entity
public class Student {

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private List<Course> courses;
}
```

---

#### 2. Many-to-Many (default is LAZY → change to EAGER)

```java
@Entity
public class Employee {

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Project> projects;
}
```

---

#### 3. One-to-One (default is EAGER → can make it explicit)

```java
@Entity
public class Passport {

    @OneToOne(fetch = FetchType.EAGER)
    private Student student;
}
```

---

#### 4. Many-to-One (default is EAGER → can make it explicit)

```java
@Entity
public class Course {

    @ManyToOne(fetch = FetchType.EAGER)
    private Student student;
}
```

---

✅ **Rule of Thumb**:

* Use **`fetch = FetchType.EAGER`** if you always need the associated entity.
* Otherwise, stick to **Lazy** and selectively fetch using `JOIN FETCH` in HQL/JPQL queries (to avoid performance issues like the **N+1 select problem**).

