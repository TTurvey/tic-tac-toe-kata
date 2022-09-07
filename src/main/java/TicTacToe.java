public class TicTacToe {
    public String[] play(String x, int i) {
        String[] gridArray = {".", ".", ".", ".", ".", ".", ".", ".", "."};
        if (i == 0) {
            gridArray[0] = "X";
        }
        if (i == 1) {
            gridArray[1] = "O";
        }
        return gridArray;
    }
}


