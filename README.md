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

=========================================================================================
