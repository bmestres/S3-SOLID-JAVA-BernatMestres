public class SwordAttackPolicy implements AttackPolicy{
    @Override
    public String attack(Character character) {
        return String.format("The %s strikes with a sword.\n", character.getType());
    }
}
