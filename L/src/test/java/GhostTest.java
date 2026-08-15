import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GhostTest {

    AttackPolicy testAttackPolicy = new SpellAttackPolicy();
    DamagePolicy testDamagePolicy = new TakeDamageNotAllowed();
    Ghost testGhost = new Ghost(testAttackPolicy, testDamagePolicy);

    @Test
    void attackOutcomeMustMatchExpected() {
        assertEquals("The ghost casts a spooky spell.", testGhost.attack());
    }

    @Test
    void takeDamageOutcomeMustMatchExpected() {
    }
}