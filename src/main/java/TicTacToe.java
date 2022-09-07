public class TicTacToe {
    public String[] play(String x, int i) {
        String[] gridArray = {".", ".", ".", ".", ".", ".", ".", ".", "."};

        gridArray[i] = "X";

        return gridArray;
    }
}


