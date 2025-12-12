🚀 API Automation Framework using Rest Assured (Java)
👨‍💻 Author: Pramod Dutta
A powerful, scalable, and CI/CD-ready API Automation Framework built using Rest Assured + Java for testing Restful Booker CRUD APIs.

📌 Project Highlights
✅ End-to-End REST API Automation
✅ Hybrid Framework Design
✅ CI/CD Enabled with Jenkins
✅ Parallel Test Execution
✅ Allure Advanced Reporting
✅ Integration Testing Included
✅ Clean Code + Maintainable Structure

▶️ Run the Test Suite
mvn test -Dsurefire.suiteXmlFiles=testng.xml
📸 Execution Preview

🛠️ Tech Stack
🔧 Tool	📘 Description
☕ Java	JDK > 22
🧪 Rest Assured	API Automation
📦 Maven	Build Tool
✅ TestNG	Test Execution
📊 Apache POI	Data Handling
🧠 AssertJ	Advanced Assertions
🔁 Jackson + GSON	Serialization
📝 Log4j	Logging
📈 Allure	Reporting
🧱 Hybrid Framework	Scalable Design
🤖 Jenkins	CI/CD
🗂️ Framework Architecture
📸 Framework Components Framework

🔁 CI/CD Execution (Jenkins)
📸 Pipeline Execution

⚙️ Maven Configuration (pom.xml)
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
▶️ Run Using:
mvn clean test -DsuiteXmlFile=testng.xml
⚡ Parallel Execution
<suite name="All Test Suite" parallel="methods" thread-count="2">
✅ Faster test execution ✅ Optimized resource usage

🔗 Integration Test Execution
mvn clean test -DsuiteXmlFile=testng-integration.xml
Includes:

✅ Token Creation
✅ Booking Creation
✅ Update Booking
✅ Delete Booking
📊 Allure Reporting
▶️ Serve Allure Report
allure serve allure-results/
📸 Allure Dashboard Allure

🧾 Allure Setup Guide
1️⃣ Install Allure (Mac)
brew install allure
2️⃣ Add Dependency
<dependency>
<groupId>io.qameta.allure</groupId>
<artifactId>allure-testng</artifactId>
<version>2.13.0</version>
</dependency>
3️⃣ Add Allure Plugin
<plugin>
<groupId>io.qameta.allure</groupId>
<artifactId>allure-maven</artifactId>
<version>2.10.0</version>
<configuration>
<reportVersion>2.13.0</reportVersion>
</configuration>
</plugin>
4️⃣ Generate Report
mvn clean test
allure generate target/allure-results --clean -o allure-report
allure open allure-report
🧪 POSTMAN Assignment Scenarios
✅ CRUD Operations with Authorization
1️⃣ Create ➝ Update ➝ Get ➝ Verify 2️⃣ Create ➝ Delete ➝ Verify Not Found 3️⃣ Get Existing ➝ Update ➝ Verify 4️⃣ Create ➝ Delete 5️⃣ Invalid Payload Validation 6️⃣ Update on Deleted ID

✅ Single Request Validation
✔️ Status Code
✔️ Headers
✔️ Response Body
📦 Create Postman Collection
✅ Restful Booker CRUD
✅ Test Scripts from Snippets
✅ Hardcoded Integration Scenarios
🌟 Why Use This Framework?
✅ Clean Architecture ✅ CI/CD Ready ✅ Parallel Execution ✅ Advanced Assertions ✅ Real-World API Scenarios ✅ Reporting with Dashboards


