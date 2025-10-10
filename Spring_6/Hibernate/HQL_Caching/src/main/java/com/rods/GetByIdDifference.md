
---

### 1. **`get()`**

* **Immediate fetch**: Hits the database immediately and returns the fully initialized entity object.
* **Return value**: Returns the entity if found, else returns `null`.
* **Use case**: When you want to actually load the entity data right away and ensure it exists.
* **Example**:

  ```java
  Student s = session.get(Student.class, 1);
  ```

---

### 2. **`byId().getReference()`**

* **Lazy fetch (proxy)**: Does **not** hit the database immediately. Instead, it returns a proxy reference of the entity.
* **Initialization**: The database is only queried when you access a non-identifier property of the entity.
* **Return value**: Always returns a proxy; if the entity does not exist, an exception (`EntityNotFoundException`) is thrown later when accessed.
* **Use case**: Useful when you only need a reference (like setting a foreign key relation) without loading the full entity.
* **Example**:

  ```java
  Student s = session.byId(Student.class).getReference(1);
  ```

---

### **Key Difference**

* `get()` → **Eager load** (returns real object, queries DB immediately, `null` if not found).
* `getReference()` → **Lazy load** (returns proxy, queries DB only when accessed, throws exception if not found).

---

👉 In short: **use `get()` when you need actual data**, and **`getReference()` when you just need a placeholder/proxy for associations or delayed initialization**.

