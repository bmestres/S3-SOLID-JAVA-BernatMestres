import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GhostTest {

    AttackPolicy testAttackPolicy = new SpellAttackPolicy();
    DamagePolicy testDamagePolicy = new TakeDamageNotAllowed();
    Ghost testGhost = new Ghost(testAttackPolicy, testDamagePolicy);

    @Test
    void attackOutcomeMustMatchExpected() {
        assertEquals("The ghost casts a spooky spell.\n", testGhost.attack());
    }

    @Test
    void takeDamageOutcomeMustMatchExpected() {
        assertEquals("A ghost cannot take physical damage!\n", testGhost.takeDamage(6));
    }
}