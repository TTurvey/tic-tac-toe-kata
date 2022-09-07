import java.util.Arrays;

public class TicTacToe {

    private String[] gridArray;
    private String playerTurn;

    public TicTacToe() {
        this.gridArray = new String[]{".", ".", ".", ".", ".", ".", ".", ".", "."};
        this.playerTurn = "X";
    }

    public String[] play(String x, int i) {
        gridArray[i] = x;
        return gridArray;
    }

    public String checkGame() {
        int[][] winingPositions = {{0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}};

        for (int i = 0; i < winingPositions.length; i++) {
            if ( gridArray[winingPositions[i][0]].equals("X") && gridArray[winingPositions[i][1]].equals("X") && gridArray[winingPositions[i][2]].equals("X") ) {
                return "Player X wins";
            }
            if ( gridArray[winingPositions[i][0]].equals("0") && gridArray[winingPositions[i][1]].equals("0") && gridArray[winingPositions[i][2]].equals("0") ) {
                return "Player 0 wins";
            }
        }

        return "Game still being played";

    }

    public String playerTurn() {
        return "Player " + playerTurn + "'s turn";
    }
}


