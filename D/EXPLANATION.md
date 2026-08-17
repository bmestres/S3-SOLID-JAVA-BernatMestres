
## (D) Dependency Inversion

🗒️ **Description**:<br>
This project applies DIP to refactor given code to save people in a database.

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
A new functional interface DataBase has been created with mySQL as one implementation
to allow for extendibility. ServicePerson class owns a reference to a DataBase and uses
its method savePerson() to sava en object of class Person.

🌳 **Project structure:**
```
D
├── D.iml
├── EXPLANATION.md
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