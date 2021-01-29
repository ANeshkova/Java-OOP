package jediGalaxy;


public class Galactic {
    private int row;
    private int col;
    private int[][] galaxy;

    public Galactic(int row, int col) {
        this.row = row;
        this.col = col;
        this.galaxy = new int[this.row][this.col];
        this.fillMatrix();
    }

    private void fillMatrix() {
        int value = 0;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                this.galaxy[i][j] = value++;
            }
        }
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getStarValue(int row, int col) {
        return this.galaxy[row][col];
    }

    public void setStarValue(int row, int col, int newValue) {
        this.galaxy[row][col] = newValue;
    }
}
