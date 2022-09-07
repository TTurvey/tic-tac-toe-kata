import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    private TicTacToe ticTacToe;

    @BeforeEach
    public void setup() {
        ticTacToe = new TicTacToe();
    }



    @Test
    public void
    should_return_position_zero() {
        String[] expectedOutput = {"X", ".", ".", ".", ".", ".", ".", ".", "."};
        String[] output = ticTacToe.play("X", 0 );
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void
    should_return_position_one() {
        String[] expectedOutput = {".", "X", ".", ".", ".", ".", ".", ".", "."};
        String[] output = ticTacToe.play("X", 1 );
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void
    should_return_position_two() {
        String[] expectedOutput = {".", ".", "X", ".", ".", ".", ".", ".", "."};
        String[] output = ticTacToe.play("X", 2 );
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void
    should_return_0_at_position_two() {
        String[] expectedOutput = {".", ".", "0", ".", ".", ".", ".", ".", "."};
        String[] output = ticTacToe.play("0", 2 );
        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void
    should_return_error_if_0_plays_first() {
        ticTacToe.play("X", 0 );
        String[] output = ticTacToe.play("X", 1 );

        String[] expectedOutput = {"X", "X", ".", ".", ".", ".", ".", ".", "."};

        assertArrayEquals(expectedOutput, output);
    }

}