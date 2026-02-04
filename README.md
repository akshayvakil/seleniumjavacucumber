# 🧪 Cucumber Demo Project

This repository contains **10 self‑contained examples** to learn and practice Cucumber with Java + TestNG.  
Each example has its own feature file, step definitions, and runner class. Reports are generated using **Extent Spark Report**.

---

## 📚 Examples Overview

1. **Example 1 – Basic Feature**
   - Single scenario, simple login flow.
   - Introduces feature files, step definitions, and runner setup.

2. **Example 2 – Multiple Scenarios**
   - One feature file with multiple scenarios (valid vs invalid login).
   - Shows how step definitions can be reused.

3. **Example 3 – Parameterized Steps**
   - Demonstrates `{string}` parameters in step definitions.
   - `"valid"` and `"invalid"` values passed dynamically.

4. **Example 4 – Scenario Outline**
   - Uses `Scenario Outline` with `Examples` table.
   - Data‑driven testing with multiple input sets.

5. **Example 5 – Tags**
   - Scenarios tagged with `@smoke`, `@regression`.
   - Runner configured to execute specific tags.

6. **Example 6 – Hooks**
   - `@Before` and `@After` hooks for setup/teardown.
   - Example: open/close browser around each scenario.

7. **Example 7 – Background**
   - Common steps defined once using `Background`.
   - Reduces repetition across scenarios.

8. **Example 8 – DataTable**
   - Passing tabular data from feature file into step definitions.
   - Useful for forms or bulk input.

9. **Example 9 – Context Sharing**
   - Sharing state between steps using dependency injection.
   - Demonstrates PicoContainer/Spring integration.

10. **Example 10 – Extent Report Integration**
    - Runner configured with Extent Spark adapter.
    - Generates `ExtentReport.html` with dashboard, timeline, and system info.

---

## ▶️ How to Run
- Navigate to the example folder.
- Run the corresponding runner class (e.g., `Example1_BasicRunner`).
- Reports will be generated in the `target/` folder:
  - Default Cucumber HTML report
  - JSON report
  - Extent Spark Report (`ExtentReport.html`)

---

## 📝 Notes
- `"valid"` and `"invalid"` are used across examples to simulate correct/incorrect credentials.
- Each example is **self‑contained** and numbered for clarity.
- This project is for **learning/demo purposes only**, not production use.
