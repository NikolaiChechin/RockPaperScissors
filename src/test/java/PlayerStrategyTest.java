import com.chechin.Move;
import com.chechin.Player;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Chechin on 01.09.2016.
 */
public class PlayerStrategyTest {

    @Test
    public void testPlayerAStrategy(){
        assertEquals(Player.PLAYER_A.getMove(), Move.PAPER);
    }

    @Test
    public void testPlayerBStrategy(){
        assertTrue(Arrays.asList(Move.values()).contains(Player.PLAYER_A.getMove()));
    }
}
