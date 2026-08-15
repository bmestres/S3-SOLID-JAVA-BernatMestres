
/* Included the default character attack although Character is made abstract
 * in case its use is required. Any character will be able to perform it */
public class DefaultAttackPolicy implements AttackPolicy {
    @Override
    public void attack(Character character) {
        System.out.format("The %s attacks with a weapon.", character.getType());
    }
}
