public class SwordAttackPolicy implements AttackPolicy{
    @Override
    public void attack(Character character) {
        System.out.format("The %s strikes with a sword.", character.getType());
    }
}
