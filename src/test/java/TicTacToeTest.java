import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
        ticTacToe.play("X", 2 );

        String message = "Player X wins";

        assertEquals(message, ticTacToe.checkGame());
    }

    @Test
    public void
    should_return_player_0_wins_first_row() {
        ticTacToe.play("0", 0 );
        ticTacToe.play("0", 1 );
        ticTacToe.play("0", 2 );

        String message = "Player 0 wins";

        assertEquals(message, ticTacToe.checkGame());
    }

    @Test
    public void
    should_return_player_X_wins_second_row() {
        ticTacToe.play("X", 3 );
        ticTacToe.play("X", 4 );
        ticTacToe.play("X", 5 );

        String message = "Player X wins";

        assertEquals(message, ticTacToe.checkGame());
    }

    @Test
    public void
    should_return_player_0_wins_second_row() {
        ticTacToe.play("0", 3 );
        ticTacToe.play("0", 4 );
        ticTacToe.play("0", 5 );

        String message = "Player 0 wins";

        assertEquals(message, ticTacToe.checkGame());
    }

    @Test
    public void
    should_return_player_X_wins_first_column() {
        ticTacToe.play("X", 0 );
        ticTacToe.play("X", 3 );
        ticTacToe.play("X", 6 );

        String message = "Player X wins";

        assertEquals(message, ticTacToe.checkGame());
    }

    @Test
    public void
    should_return_player_0_wins_first_column() {
        ticTacToe.play("0", 0 );
        ticTacToe.play("0", 3 );
        ticTacToe.play("0", 6 );

        String message = "Player 0 wins";

        assertEquals(message, ticTacToe.checkGame());
    }

    @ParameterizedTest
    @CsvSource({
            "X, 0,X, 1,X, 2, Player X wins"
    })
    void should_return_player_X(String symbol1, int position1, String symbol2, int position2, String symbol3, int position3, String result) {
        ticTacToe.play(symbol1, position1);
        ticTacToe.play(symbol2, position2);
        ticTacToe.play(symbol3, position3);

        assertEquals(result, ticTacToe.checkGame());
    }

    @Test
    public void
    should_be_player_X_turn_at_start() {
        String message = "Player X's turn";
        assertEquals(message, ticTacToe.playerTurn());
    }

    @Test
    public void
    should_be_player_0_after_player_X_turn() {
        ticTacToe.play("X",0);
        String message = "Player 0's turn";
        assertEquals(message, ticTacToe.playerTurn());
    }

    @Test
    public void
    should_players_alternate_placing() {
        ticTacToe.play("X",0);
        ticTacToe.play("0",1);
        ticTacToe.play("X",2);
        String message = "Player 0's turn";
        assertEquals(message, ticTacToe.playerTurn());
    }




}