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
🧠 **Explanation:**<br><br>
The original User class has been released from logic and left uniquely as a data structure. 
Additionally, the input validation has been separated to a EmailUserInputsCheck class. <br><br>
Turned the Notification system into an interface with implementations, such as EmailService, that can be extended in the future. 
Validation has also been turned into an interface with StandardUserValidator as one implementation, to allow
for other future implementations.<br><br>
Finally, Register class has a UserValidator and a NotificationService to perform the actual registration.


#### 🌳 Project structure:

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
