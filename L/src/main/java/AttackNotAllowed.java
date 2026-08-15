/* Included attack not allowed for potential future classes that can't attack*/
public class AttackNotAllowed implements AttackPolicy {
    @Override
    public String attack(Character character) {
        return String.format("The %s cannot attack", character.getType());
    }
}
