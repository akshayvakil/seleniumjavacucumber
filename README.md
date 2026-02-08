**🥒 Cucumber + Selenium Automation Framework


**🚀** Project Summary****

An enterprise-ready test automation framework built using Cucumber (BDD) and Selenium WebDriver with Java. Designed to demonstrate real-world automation architecture, clean coding practices, and scalable test execution—ideal for interviews and production-grade use cases.

**Tech Stack:**
Java · Selenium WebDriver · Cucumber (BDD) · TestNG / JUnit · ExtentReports / Allure


# 🥒 Cucumber Practice Feature Files

This repository contains Cucumber feature files created to practice **core and advanced BDD concepts** commonly used in real-world automation frameworks.

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

