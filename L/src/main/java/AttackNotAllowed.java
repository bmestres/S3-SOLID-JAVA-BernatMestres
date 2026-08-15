/* Included attack not allowed for potential future classes that can't attack*/
public class AttackNotAllowed implements AttackPolicy {
    public AttackNotAllowed() {
    }
    @Override
    public void attack(Character character) {
        System.out.format("The %s cannot attack", character.getType());
    }
}
