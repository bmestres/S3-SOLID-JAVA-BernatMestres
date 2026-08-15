public class ResistedDamage implements DamagePolicy {
    private static final int PROTECTION_FACTOR = 2;

    @Override
    public void takeDamage(Character character, int points) {
        int damageReceived = points / PROTECTION_FACTOR;
        System.out.format("The %s resists and only takes %d points of damage", character.getType(), damageReceived);
    }
}
