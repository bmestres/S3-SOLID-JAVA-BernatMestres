public class SpellAttackPolicy implements AttackPolicy{
    @Override
    public void attack(Character character) {
        System.out.format("The %s casts a spooky spell.\n", character.getType());
    }
}
