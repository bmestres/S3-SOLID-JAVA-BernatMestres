public class Drums implements Playable{

    private static final String NAME = "Drums";

    public String getName(){
        return this.NAME;
    }

    @Override
    public void play(){
        System.out.println("🥁 Beating the drums");
    }
}
