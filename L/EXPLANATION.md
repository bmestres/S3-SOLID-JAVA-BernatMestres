
## L (Liskov Substitution)

🗒️ **Description**:<br>
This project applies LSP to refactor given code to implement attack and damage strategies
for a game.

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
All the functionality from the original classes has been delegated to interfaces (AttackPolicy and DamagePolicy).
In addition, Character class is made abstract and owns references to AttackPolicy and DamagePolicy objects. 
This refactoring allows the subclasses replace the superclasses. <br><br>
On the other hand, DefaultAttackPolicy, SpellAttackPolicy, SwordAttackPolicy or AttackNotAllowed implement AttackPolicy.
DefaultDamage, ResistedDamage and TakeDamageNotAllowed now implement DamagePolicy, which allows for flexibility in 
terms of attack() and takeDamage() functionality through any character.

```
L
├── EXPLANATION.md
├── L.iml
├── pom.xml
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   ├── AttackNotAllowed.java
    │   │   ├── AttackPolicy.java
    │   │   ├── Character.java
    │   │   ├── DamagePolicy.java
    │   │   ├── DefaultAttackPolicy.java
    │   │   ├── DefaultDamage.java
    │   │   ├── Ghost.java
    │   │   ├── ResistedDamage.java
    │   │   ├── SpellAttackPolicy.java
    │   │   ├── SwordAttackPolicy.java
    │   │   ├── TakeDamageNotAllowed.java
    │   │   └── Warrior.java
    │   └── resources
    └── test
        ├── java
        │   ├── GhostTest.java
        │   └── WarriorTest.java
        └── resources`
```