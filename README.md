**🥒 Cucumber + Selenium Automation Framework

This repository demonstrates an advanced Cucumber + Selenium + Java automation framework showcasing modular design with **Page Object Model, Hooks, and BaseClass**.
It covers a DataTable‑driven Registration feature, executed via a dedicated runner class for end‑to‑end validation.


**Tech Stack:**
Java · Selenium WebDriver · Cucumber (BDD) · TestNG / JUnit · ExtentReports / Allure

**🔑 Framework Highlights**
Hooks (Hooks.java) manage driver lifecycle (@Before → setup, @After → teardown).

BaseClass centralizes WebDriver initialization and utilities.

Page Object Model (POM) separates locators (RegistrationPageLocators.java) and actions (RegistrationPageActions.java).

Data‑Driven Testing via Cucumber DataTables for flexible input.

Tagged Hooks & Runner Options allow selective execution.

Reports generated through plugins (HTML/JSON/Extent).
---

## 📄 Example1_BasicFeature.feature
**Scenario: Successful login**

Covers a **basic Cucumber scenario structure** using `Given–When–Then`.  
Demonstrates simple step definitions without parameters or data-driven logic.

---

## 📄 Example2_MultiScenarioFeature.feature
**Scenario: Login with valid credentials**  
**Scenario: Login with invalid credentials**

Demonstrates **multiple scenarios within a single feature file**.  
Introduces **parameterized steps** using quoted values (`"valid"` / `"invalid"`).

---

## 📄 Example3_DataDrivenLoginExampleTable.feature

**Scenario Outline: Login with multiple credential sets**

Covers **Scenario Outline with Examples table** for data-driven testing.  
Includes **Background**, **Tags (@SmokeTest, @Regression)**, and reusable steps.

**Scenario: Login with locked account**

Demonstrates a **standalone scenario** executed under a specific tag.

---

## 📄 Example4_RegistrationUsingDataDrivenTable.feature

**Scenario: Register new user with multiple details**

Demonstrates **Cucumber DataTable** usage for form-based input.  
Shows how structured test data is passed without Scenario Outline.

---

## 🎯 Concepts Practiced
- Given / When / Then syntax  
- Multiple scenarios per feature  
- Parameterized steps  
- Background keyword  
- Scenario Outline + Examples  
- DataTables  
- Tags for selective execution  

---

This setup is intended for **learning, interview preparation, and framework practice**.

