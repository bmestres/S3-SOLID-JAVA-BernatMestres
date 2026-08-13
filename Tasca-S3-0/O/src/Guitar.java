public class Guitar implements Playable{

    private static final String NAME = "Guitar";

    public String getName(){
        return this.NAME;
    }

    @Override
    public void play(){
        System.out.println("🎸 Strumming the guitar");
    }
}
