
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
The original User class has been released from logic and left uniquely as a data structure. 
Additionally, the input validation has been separated to a EmailUserInputsCheck class. Turned the Notification
strategy into an interface with implementations, such as EmailService, that can be extended in the future.





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
    │   │   └── EmailUserInputsCheck.java
    │   └── resources
    └── test
        ├── java
        │   ├── RegisterTest.java
        │   └── EmailUserInputsCheckTest.java
        └── resources
```
