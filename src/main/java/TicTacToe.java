import java.util.Arrays;

public class TicTacToe {

    private String[] gridArray;

    public TicTacToe() {
        this.gridArray = new String[]{".", ".", ".", ".", ".", ".", ".", ".", "."};
    }

    public String[] play(String x, int i) {
        gridArray[i] = x;
        System.out.println(Arrays.toString(gridArray));
        return gridArray;
    }
}


