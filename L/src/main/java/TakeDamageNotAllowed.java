public class TakeDamageNotAllowed implements DamagePolicy {
    @Override
    public String takeDamage(Character character, int points) {
        return String.format("A %s cannot take physical damage!\n", character.getType());
    }
}
