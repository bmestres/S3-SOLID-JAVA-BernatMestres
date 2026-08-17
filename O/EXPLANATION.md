
## O (Open Closed Principle)

🗒️ **Description**:<br>
This project applies OCP to refactor given code to play different instruments.

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



```
D
├── D.iml
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   ├── DataBase.java
    │   │   ├── MySQL.java
    │   │   ├── Person.java
    │   │   └── ServicePerson.java
    │   └── resources
    └── test
        ├── java
        └── resources

```