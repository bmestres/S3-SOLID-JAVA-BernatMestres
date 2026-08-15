/* Kept the DefaultDamage policy from the original code, even if Character is made abstract,
in case it's required. */
public class DefaultDamage implements DamagePolicy {
    @Override
    public String takeDamage(Character character, int points) {
        return String.format("The character takes %d points of damage", points);
    }
}
