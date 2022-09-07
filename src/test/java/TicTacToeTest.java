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
    should_return_moves() {
        ticTacToe.play("X", 0 );
        String[] output = ticTacToe.play("X", 1 );

        String[] expectedOutput = {"X", "X", ".", ".", ".", ".", ".", ".", "."};

        assertArrayEquals(expectedOutput, output);
    }

    @Test
    public void
    should_return_player_X_wins_first_row() {
        ticTacToe.play("X", 0 );
        ticTacToe.play("X", 1 );
        String[] output = ticTacToe.play("X", 2 );

        String[] expectedOutput = {"X", "X", "X", ".", ".", ".", ".", ".", "."};
        String message = "Player X wins";

        assertEquals(message, ticTacToe.checkGame());
    }

    @Test
    public void
    should_return_player_0_wins_first_row() {
        ticTacToe.play("0", 0 );
        ticTacToe.play("0", 1 );
        String[] output = ticTacToe.play("0", 2 );

        String[] expectedOutput = {"0", "0", "0", ".", ".", ".", ".", ".", "."};
        String message = "Player 0 wins";

        assertEquals(message, ticTacToe.checkGame());
    }

    @Test
    public void
    should_return_player_X_wins_second_row() {
        ticTacToe.play("X", 3 );
        ticTacToe.play("X", 4 );
        String[] output = ticTacToe.play("X", 5 );

        String[] expectedOutput = {".", ".", ".", "X", "X", "X", ".", ".", "."};
        String message = "Player X wins";

        assertEquals(message, ticTacToe.checkGame());
    }

   /* @Test
    public void
    should_return_player_0_wins_second_row() {
        ticTacToe.play("0", 3 );
        ticTacToe.play("0", 4 );
        String[] output = ticTacToe.play("0", 5 );

        String[] expectedOutput = {"0", "0", "0", ".", ".", ".", ".", ".", "."};
        String message = "Player 0 wins";

        assertEquals(message, ticTacToe.checkGame());
    }*/

}