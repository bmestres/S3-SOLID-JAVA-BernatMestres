import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PlayableTest {

    @Test
    void returnValueMustMatchExpectedReturn() {
        List<Playable> instruments = new ArrayList<>();

        Playable instrument01 = new Guitar();
        Playable instrument02 = new Drums();
        Playable instrument03 = new Piano();
        Playable instrument04 = new UnknownInstrument();

        assertEquals( "🎸 Strumming the guitar", instrument01.play());
        assertEquals("🥁 Beating the drums", instrument02.play());
        assertEquals("🎹 Playing the piano", instrument03.play());
        assertEquals("🔇 Unknown instrument", instrument04.play());
    }
}