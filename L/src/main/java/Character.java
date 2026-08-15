public abstract class Character {
    private final String type;
    private AttackPolicy attackPolicy;

    public Character(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

}
