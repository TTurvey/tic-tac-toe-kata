import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    public void
    should_return_position_zero() {
        String[] expectedOutput = {"X", ".", ".", ".", ".", ".", ".", ".", "."};
        String[] output = new TicTacToe().play("X", 0 );
        assertTrue( Arrays.equals(expectedOutput, output ));
    }

    @Test
    public void
    should_return_position_one() {
        String[] expectedOutput = {".", "O", ".", ".", ".", ".", ".", ".", "."};
        String[] output = new TicTacToe().play("O", 1 );
        assertTrue( Arrays.equals(expectedOutput, output ));
    }

}