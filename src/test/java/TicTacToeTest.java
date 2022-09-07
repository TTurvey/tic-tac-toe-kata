import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    public void
    should_return_state_of_the_grid() {
        String[] expectedOutput = {"X", ".", ".", ".", ".", ".", ".", ".", "."};
        String[] output = new TicTacToe().play("X", 0 );
        assertTrue( Arrays.equals(expectedOutput, output ));
    }

}