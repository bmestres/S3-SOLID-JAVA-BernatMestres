## I (Interface Segragation)

🗒️ **Description**:<br>
This project applies ISP to refactor given code to manage several electrodomestic functions.

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
All the functionality from the original MachineActions interface is now 
divided into Cooler, Heater and Washer, in order to prevent the 
classes from having to provide an implementation for each machine functionality.
MachineActions interface is kept with on/off methods which are common in all
machines.


````
I
├── EXPLANATION.md
├── I.iml
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   ├── AirConditioner.java
    │   │   ├── Cooler.java
    │   │   ├── Heater.java
    │   │   ├── MachineActions.java
    │   │   ├── Washer.java
    │   │   └── WashingMachine.java
    │   └── resources
    └── test
        ├── java
        └── resources
````