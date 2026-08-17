public abstract class Character {
    private final String type;
    private AttackPolicy attackPolicy;
    private DamagePolicy damagePolicy;

    public Character(String type, AttackPolicy attackPolicy, DamagePolicy damagePolicy) {
        checkInputData(type, attackPolicy, damagePolicy);

        this.type = type;
        this.attackPolicy = attackPolicy;
        this.damagePolicy = damagePolicy;
    }

    private static void checkInputData(String inputType, AttackPolicy inputAttackPolicy, DamagePolicy inputDamagePolicy){
        if(inputType == null){
            throw new IllegalArgumentException("Type must not be NULL");
        }
        attackPolicyCheck(inputAttackPolicy);
        damagePolicyCheck((inputDamagePolicy));
    }

    private static AttackPolicy attackPolicyCheck(AttackPolicy inputAttackPolicy){
        if(inputAttackPolicy == null){
            throw new IllegalArgumentException("Attack policy must not be NULL");
        }
        return inputAttackPolicy;
    }

    private static DamagePolicy damagePolicyCheck(DamagePolicy inputDamagePolicy){
        if(inputDamagePolicy == null){
            throw new IllegalArgumentException("Damage policy must not be NULL");
        }
        return inputDamagePolicy;
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
