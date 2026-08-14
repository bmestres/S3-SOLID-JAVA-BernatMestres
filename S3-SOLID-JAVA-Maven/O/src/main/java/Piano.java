public class Piano implements Playable{

    private static final String NAME = "Piano";

    public String getName(){
        return this.NAME;
    }

    @Override
    public void play(){
        System.out.println("🎹 Playing the piano");
    }
}
