CORE DESIGN PATTERN

👉 STRATEGY DESIGN PATTERN

👉 FACTORY DESIGN PATTERN

🎯 Interview-Ready Answer

Q: What is the Factory Design Pattern, and how is it different from Abstract Factory?

👉 Answer:
“Factory is a Creational Design Pattern that abstracts the object creation logic.
Instead of using new everywhere, we use a factory method that decides which object to return based on input or context.

A common real-world example is LoggerFactory.getLogger() in SLF4J, or DriverManager.getConnection() in JDBC.

The main benefit is loose coupling and following the Open/Closed Principle — I can add new product types without modifying client code.”

Difference with Abstract Factory:

Factory Method → creates a single product type.
Example: NotificationFactory creates Email, SMS, or Push notification.

Abstract Factory → creates families of related products together.
Example: A GUIFactory might create both Button and Checkbox for Windows or Mac.
JDBC is another example — when you choose a database driver, you get a compatible Connection, Statement, and ResultSet.

So in short:
👉 Factory Method = one product creator
👉 Abstract Factory = factory of factories, produces related product families.

Key takeaway to interviewer:

Factory reduces code duplication and centralizes object creation.

Abstract Factory ensures product consistency when dealing with families of related objects.

Both are heavily used in frameworks like Spring, JDBC, Logging libraries.

🔹 Tricky Factory Pattern Interview Questions & Answers

1. Why not just use new instead of a Factory?

👉 Answer:
Using new everywhere makes the code tightly coupled with concrete classes.
If we later want to change the implementation (e.g., switch from EmailNotification to SlackNotification), we’d have to change multiple places in the code.
Factory centralizes creation logic → easier to maintain, test, and extend.

2. How does Factory Pattern follow SOLID principles?

👉 Answer:

Single Responsibility → Factory class only handles object creation.

Open/Closed → We can add new product types without modifying existing client code.

Dependency Inversion → Clients depend on abstraction (Notification), not concrete classes.

3. Where have you seen Factory Pattern in Java libraries?

👉 Answer:

LoggerFactory.getLogger() in SLF4J.

DriverManager.getConnection() in JDBC.

DocumentBuilderFactory.newInstance() in XML parsers.

ExecutorService.newFixedThreadPool() in concurrency utilities.

4. Difference between Factory Method and Abstract Factory in one line?

👉 Answer:

Factory Method → Creates one product.

Abstract Factory → Creates related product families.

5. Can Factory Pattern break the Open/Closed Principle?

👉 Answer:
Yes — if the factory uses a long if-else or switch inside it.
To avoid this, we can use Reflection, Registration Map, or even dependency injection (Spring does this).

6. How is Factory different from Builder Pattern?

👉 Answer:

Factory → Decides which type of object to create.

Builder → Focuses on how to build a complex object step by step.

👉 Example:
Factory chooses between Car vs Bike.
Builder builds a Car with step-by-step configurations (engine, color, wheels).

7. How does Spring use Factory internally?

👉 Answer:
Spring’s BeanFactory and ApplicationContext are factories.
They create and manage beans so we don’t manually use new.
This allows dependency injection, testing, and loose coupling.

8. When should you not use Factory Pattern?

👉 Answer:

If object creation is very simple and unlikely to change.

Using factory everywhere adds unnecessary abstraction and boilerplate.


# 🎯 Adapter Design Pattern (with Factory) – Talent Acquisition System Example

## 📌 Overview
The **Adapter Pattern** is a **structural design pattern** that allows incompatible interfaces to work together.  
It introduces an adapter that translates one interface into another expected by the client.

This repo demonstrates how to apply the **Adapter Pattern** (and extend it with a **Factory**) in a **Talent Acquisition (TA) System** that integrates candidate profiles from multiple job portals (LinkedIn, Naukri, Indeed).

---

## 🔹 When to Use
- When integrating **legacy systems** or **3rd-party APIs** with incompatible interfaces.
- When reusing existing functionality without modifying it.
- When normalizing data from multiple sources into a **standard interface**.

---

## 🔹 Problem Statement
In a Talent Acquisition system, candidate profiles come from different job portals:

- **LinkedIn API** → `LinkedInProfile`
- **Naukri API** → `NaukriProfile`
- **Indeed API** → `IndeedProfile`

Each API returns data in a **different structure**, but the TA system expects a **common interface**:

```java
public interface CandidateProfile {
    String getFullName();
    String getEmail();
    String getPhone();
}
```

---

## 🔹 Solution with Adapter Pattern
We use an **adapter** for each job portal to translate its profile format into the **standard `CandidateProfile` interface**.

- `LinkedInProfileAdapter`
- `NaukriProfileAdapter`
- `IndeedProfileAdapter`

This ensures the TA system only interacts with `CandidateProfile`, regardless of the data source.

---

## 🔹 Scaling with Factory + Adapter
To make the solution **production-ready**, we introduce a **Factory**:

```java
public class CandidateProfileAdapterFactory {
    public static CandidateProfile getAdapter(SourceType sourceType, Object rawProfile) {
        switch (sourceType) {
            case LINKEDIN: return new LinkedInProfileAdapter((LinkedInProfile) rawProfile);
            case NAUKRI:   return new NaukriProfileAdapter((NaukriProfile) rawProfile);
            case INDEED:   return new IndeedProfileAdapter((IndeedProfile) rawProfile);
            default: throw new IllegalArgumentException("Unsupported source: " + sourceType);
        }
    }
}
```

- The **Factory** dynamically selects the correct adapter based on the `SourceType`.
- Adding new job portals (e.g., Monster, Glassdoor) only requires adding a new adapter and enum value.
- The TA system remains **scalable** and **loosely coupled**.

---

## 🔹 Benefits
✅ **Consistency** → TA system processes only one standard model.  
✅ **Extensibility** → New sources can be integrated with minimal changes.  
✅ **Loose Coupling** → Core system is independent of 3rd-party APIs.  
✅ **Industry Relevant** → Real ATS/HR systems use this approach for multi-job board integrations.

---

## 🔹 Interview-Style Explanation
*"I applied the Adapter Pattern in a Talent Acquisition system to normalize candidate data from multiple job portals (LinkedIn, Naukri, Indeed) into a single interface.  
Later, I extended it with a Factory to dynamically select the right adapter, making the system scalable, loosely coupled, and integration-ready."*
