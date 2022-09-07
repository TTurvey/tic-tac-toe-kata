import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    public void
    should_return_position_zero() {
        String[] expectedOutput = {"X", ".", ".", ".", ".", ".", ".", ".", "."};
        String[] output = new TicTacToe().play("X", 0 );
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void
    should_return_position_one() {
        String[] expectedOutput = {".", "X", ".", ".", ".", ".", ".", ".", "."};
        String[] output = new TicTacToe().play("X", 1 );
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void
    should_return_position_two() {
        String[] expectedOutput = {".", ".", "X", ".", ".", ".", ".", ".", "."};
        String[] output = new TicTacToe().play("X", 2 );
        assertArrayEquals(expectedOutput, output);
    }

}