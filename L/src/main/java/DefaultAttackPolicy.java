/* Included the default character attack although Character is made abstract
* in case its use is required. Any character will be able to perform it */
public class DefaultAttackPolicy implements AttackPolicy{
    @Override
    public void attack() {
        System.out.println("The character attacks with a weapon.");
    }
}
