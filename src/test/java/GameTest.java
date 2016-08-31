import com.chechin.Game;
import com.chechin.Move;
import com.chechin.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by chechin on 31.08.2016.
 */
public class GameTest {

    @Test
    public void testPlayerAWin() {
        Game game = new Game(Move.SCISSORS, Move.PAPER);
        assertEquals(game.getWinner(), Player.PLAYER_A);
    }

    @Test
    public void testPlayerBWin() {
        Game game = new Game(Move.SCISSORS, Move.ROCK);
        assertEquals(game.getWinner(), Player.PLAYER_B);
    }

    @Test
    public void testTie() {
        Game game = new Game(Move.ROCK, Move.ROCK);
        assertNull(game.getWinner());
    }
}
