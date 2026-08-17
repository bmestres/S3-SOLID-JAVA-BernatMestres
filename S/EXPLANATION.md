
## S (Single Responsibility Principle)

🗒️ **Description**:<br>
This project applies SRP to refactor given code to perform a user registration to an email service.  


⚙️ **Prerequisites:**<br>
* **JDK**
* **Maven**: Required to download external dependencies 
(JUnit and Mockito for testing)


⚡️ **Execution:**
``` text
mvn clean compile
mvn test
```
🧠 **Explanation:**<br>
The original



#### 🧩 Structure:

``` text
S
├── EXPLANATION.md
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   ├── EMailService.java
    │   │   ├── NotificationService.java
    │   │   ├── Register.java
    │   │   ├── User.java
    │   │   └── UserInputsCheck.java
    │   └── resources
    └── test
        ├── java
        │   ├── RegisterTest.java
        │   └── UserInputsCheckTest.java
        └── resources
```
