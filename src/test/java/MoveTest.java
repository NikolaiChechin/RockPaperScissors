import com.chechin.Move;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by Chechin on 01.09.2016.
 */
public class MoveTest {

    @Test
    public void testGetRandomMove(){
        assertTrue(Arrays.asList(Move.values()).contains(Move.getRandomMove()));
    }
}
