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
    should_return_player_X_wins_first_row() {
        ticTacToe.play("X", 0 );
        ticTacToe.play("0", 3 );
        ticTacToe.play("X", 1 );
        ticTacToe.play("0", 4 );
        ticTacToe.play("X", 2 );

        String message = "Player X wins";

        assertEquals(message, ticTacToe.checkGame());
    }

    @ParameterizedTest
    @CsvSource({
            "{{'X',0},{'0',3},{'X',1},{'0',4},{'X',2}, Player X wins}",
            "{{'0',0},{'X',3},{'0',1},{'X',4},{'0',2}, Player X wins}",
            "{{'X',3},{'0',6},{'X',4},{'0',7},{'X',5}, Player X wins}",
            "{{'0',3},{'X',6},{'0',4},{'X',7},{'0',5}, Player X wins}",
            "{{'X',0},{'0',7},{'X',3},{'0',8},{'X',6}, Player X wins}",
            "{{'0',0},{'X',7},{'0',3},{'X',8},{'0',6}, Player X wins}",
    })
    void should_return_player_X(String symbol1, int position1, String symbol2, int position2, String symbol3, int position3, String symbol4, int position4, String symbol5, int position5, String result) {
        ticTacToe.play(symbol1, position1);
        ticTacToe.play(symbol2, position2);
        ticTacToe.play(symbol3, position3);
        ticTacToe.play(symbol4, position4);
        ticTacToe.play(symbol5, position5);

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
    should_return_error_if_player_0_goes_first() {
        String message = "Error: Player X goes first";
        assertEquals(message, ticTacToe.checkFirstTurnPlayer("0"));
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