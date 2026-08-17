
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
Instruments are made implementations of the new interface Playable. Given that
none of the instruments have any attributes they are kept as functional objects
performing one sole method: play(). <br><br>
Extracting the functionality to an interface allows for more flexibility than the
original if-else structure.


🌳 **Project structure:**
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