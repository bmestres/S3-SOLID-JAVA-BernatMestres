public class ResistedDamage implements DamagePolicy {
    private static final int PROTECTION_FACTOR = 2;

    @Override
    public String takeDamage(Character character, int points) {
        int damageReceived = points / PROTECTION_FACTOR;
        return String.format("The %s resists and only takes %d points of damage.\n", character.getType(), damageReceived);
    }
}
