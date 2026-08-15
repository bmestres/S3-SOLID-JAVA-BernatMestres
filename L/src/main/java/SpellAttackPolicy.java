public class SpellAttackPolicy implements AttackPolicy{

    @Override
    public void attack() {
        System.out.format("The %s casts a spooky spell.\n", character.getType);
    }
}
