public abstract class Character {
    private final String type;
    private AttackPolicy attackPolicy;
    private DamagePolicy damagePolicy;

    protected Character(String type, AttackPolicy attackPolicy, DamagePolicy damagePolicy) {
        this.type = type;
        this.attackPolicy = attackPolicy;
        this.damagePolicy = damagePolicy;
    }

    public void setAttackPolicy(AttackPolicy policy){
        this.attackPolicy = policy;
    }

    public void setDamagePolicy(DamagePolicy policy){
        this.damagePolicy = policy;
    }

    public String getType() {
        return this.type;
    }

    public String attack(){
        return this.attackPolicy.attack(this);
    }

    public String takeDamage(int points){
        return this.damagePolicy.takeDamage(this, points);
    }
}
