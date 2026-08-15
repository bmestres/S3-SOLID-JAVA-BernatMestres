import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    AttackPolicy testAttackPolicy = new SwordAttackPolicy();
    DamagePolicy testDamagePolicy = new ResistedDamage();
    Warrior testWarrior = new Warrior(testAttackPolicy, testDamagePolicy);

    @Test
    void attackOutcomeMustMatchExpectedValue() {
        assertEquals("The warrior strikes with a sword.\n", testWarrior.attack());
    }

    @Test
    void takeDamageOutcomeMustMatchExpectedValue() {
        assertEquals("The warrior resists and only takes 2 points of damage.\n", testWarrior.takeDamage(4));
    }
}