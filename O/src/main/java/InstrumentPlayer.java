public class InstrumentPlayer {
    public String play(Playable instrument) {
        return instrument.play();
    }

    public static void main(String[] args) {
        InstrumentPlayer player = new InstrumentPlayer();

        System.out.println(player.play(new Guitar()));
        System.out.println(player.play(new Drums()));
        System.out.println(player.play(new Piano()));
        System.out.println(player.play(new UnknownInstrument()));
    }
}
