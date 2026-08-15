public class TakeDamageNotAllowed implements DamagePolicy {
    @Override
    public void takeDamage(Character character, int points) {
        System.out.format("The %s cannot be damaged", character.getType());
    }
}
