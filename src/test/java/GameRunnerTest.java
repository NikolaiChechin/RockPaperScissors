import com.chechin.GameRunner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Chechin on 01.09.2016.
 */
public class GameRunnerTest {

    @Test(expected = IllegalStateException.class)
    public void testIllegalGameRunnerStatePlayerAWinCount(){
        GameRunner gameRunner = new GameRunner();
        gameRunner.getPlayerAWinCount();
    }

    @Test(expected = IllegalStateException.class)
    public void testIllegalGameRunnerStatePlayerBWinCount(){
        GameRunner gameRunner = new GameRunner();
        gameRunner.getPlayerBWinCount();
    }

    @Test(expected = IllegalStateException.class)
    public void testIllegalGameRunnerStateTieCount(){
        GameRunner gameRunner = new GameRunner();
        gameRunner.getTieCount();
    }

    @Test
    public void testGameWinCount(){
        GameRunner gameRunner = new GameRunner();
        gameRunner.setRunCount(100);
        gameRunner.runGame();
        int playerAWinCount = gameRunner.getPlayerAWinCount();
        int playerBWinCount = gameRunner.getPlayerBWinCount();
        int tieCount = gameRunner.getTieCount();
        assertEquals(playerAWinCount + playerBWinCount + tieCount, 100);
    }
}
