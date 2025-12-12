# 🚀 API Automation Framework using Rest Assured (Java)

## 👨‍💻 Author: Shafna S

A powerful, scalable & CI/CD-ready automation framework built using Rest Assured + Java for testing Restful Booker CRUD APIs with best-practice architecture and modern reporting.

### ⭐ Project Highlights

✅ End-to-End REST API Automation

🧩 Hybrid Framework Design

🔁 Parallel Test Execution

🤖 CI/CD Enabled with Jenkins

📊 Allure Advanced Reporting

📦 Integration Test Suite Included

🧼 Clean, Scalable & Maintainable Codebase

### ▶️ Run the Test Suite

mvn test -Dsurefire.suiteXmlFiles=testng.xml


📸 Execution Preview
(Add your screenshots here)

### 🛠️ Tech Stack

🔧 Tool/Tech	📘 Description
☕ Java	JDK 22+
🧪 Rest Assured	API Automation Library
📦 Maven	Build Tool
✅ TestNG	Test Runner
📊 Apache POI	Excel Data Handling
🧠 AssertJ	Fluent Assertions
🔁 Jackson + GSON	Serialization/Deserialization
📝 Log4j2	Logging
📈 Allure Reports	Rich HTML Reports
🧱 Hybrid Framework	Scalable Architecture
🤖 Jenkins	CI/CD Automation

### 🗂️ Framework Architecture

📦 Core Components Include

🔹 /base – Base test setup

🔹 /config – Environment config

🔹 /endpoints – API endpoints

🔹 /payloads – Request builders

🔹 /tests – Test classes

🔹 /utils – Helper utilities

🔹 /reports – Allure result outputs

📸 Add architecture diagram here

### 🔁 CI/CD Execution (Jenkins)

Use the Jenkins pipeline to trigger:

🔹 API Tests

🔹 Parallel Execution

🔹 Allure Reports Publishing

📸 Pipeline Screenshot Placeholder

### ⚙️ Maven Configuration (pom.xml)

<build>
<plugins>
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-surefire-plugin</artifactId>
<version>3.3.0</version>
<configuration>
<suiteXmlFiles>
<suiteXmlFile>${suiteXmlFile}</suiteXmlFile>
</suiteXmlFiles>
</configuration>
</plugin>
</plugins>
</build>

### ▶️ Run Using:

mvn clean test -DsuiteXmlFile=testng.xml

### ⚡ Parallel Execution

<suite name="All Test Suite" parallel="methods" thread-count="2">


🚀 Faster Execution

📉 Optimized CPU Usage

### 🔗 Integration Test Execution

mvn clean test -DsuiteXmlFile=testng-integration.xml


Includes:

✔️ Token Creation

✔️ Create Booking

✔️ Update Booking

✔️ Delete Booking

### 📊 Allure Reporting

### ▶️ Serve Allure Report

allure serve allure-results/


### 📸 Allure Dashboard Screenshot Placeholder

### 🧾 Allure Setup Guide

### 1️⃣ Install Allure (Mac)

brew install allure

### 2️⃣ Add Dependency

<dependency>
<groupId>io.qameta.allure</groupId>
<artifactId>allure-testng</artifactId>
<version>2.13.0</version>
</dependency>

### 3️⃣ Add Allure Maven Plugin

<plugin>
<groupId>io.qameta.allure</groupId>
<artifactId>allure-maven</artifactId>
<version>2.10.0</version>
<configuration>
<reportVersion>2.13.0</reportVersion>
</configuration>
</plugin>

### 4️⃣ Generate Reports

mvn clean test
allure generate target/allure-results --clean -o allure-report
allure open allure-report

### 🧪 POSTMAN Assignment Scenarios

#### ✅ CRUD Operations (with Auth)

➕ Create → ✏️ Update → 🔍 Get → ✔ Verify

➕ Create → ❌ Delete → 🔍 Verify Not Found

🔍 Get Existing → ✏️ Update → ✔ Verify

➕ Create → ❌ Delete

⚠️ Invalid Payload Validation

✏️ Update on Deleted ID

#### ✅ Single Request Validation

✔ Status Code

✔ Headers

✔ Response Body

### 📦 Postman Collection Includes

Restful Booker CRUD

Test Scripts

Hardcoded Integration Scenarios

### 🌟 Why Use This Framework?

✔ Clean & Scalable Architecture
✔ CI/CD Ready
✔ Parallel Execution
✔ Advanced Assertions
✔ Real-World API Scenarios
✔ Stunning Reporting Dashboards