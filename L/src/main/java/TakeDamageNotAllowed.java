public class TakeDamageNotAllowed implements DamagePolicy {
    @Override
    public String takeDamage(Character character, int points) {
        return String.format("The %s cannot be damaged", character.getType());
    }
}
