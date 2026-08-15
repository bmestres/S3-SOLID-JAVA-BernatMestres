/* Included attack not allowed for potential future classes that can't attack*/
public class AttackNotAllowed implements AttackPolicy{
    @Override
    public void attack() {
        System.out.format("The %s cannot attack", character.getType());
    }
}
