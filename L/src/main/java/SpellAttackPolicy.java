public class SpellAttackPolicy implements AttackPolicy{
    @Override
    public String attack(Character character) {
        return String.format("The %s casts a spooky spell.\n", character.getType());
    }
}
