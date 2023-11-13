public class Matrix {

  int size;
  int row;
  int col;

  public Matrix(int size) {
    this.table = new int[size][size];

    System.out.println("Your matrix is " + size + " x " + size);
  }

  private int[][] table;
  private void swap(int x1, int y1, int x2, int y2) {
    int temp = table[x1][y1];
    table[x1][y1] = table[x2][y2];
    table[x2][y2] = temp;
  }

  public void zeroMatrix() {
    for (row = 0; row < table.length; row++) {
      for (col = 0; col < table[row].length; col++) {
        table[row][col] = 0;
      }
    }
  }

  public void populateMatrix() {
    int n = table.length;
    int value = 1;

    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {
        table[row][col] = value++;
      }
    }
  }

  void flipMatrix() {
    int num = table.length;
    for (row = 0; row < table.length; row++) {
      for (col = 0; col < table[row].length; col++) {
        if (row+col < num-1) {
          swap(row, col, num-1-row, num-1-col);
        }
      }
    }
  }

  void printMatrix() {
    int num = table.length;
    for (int row = 0; row < table.length; row++) {
      for (int col = 0; col < table[row].length; col++) {
        // highlight number if in diagnol
        if (row+col == num-1) {
          System.out.print("\033[0;33m" + table[row][col] + "\033[0m" + "\t");
        }
        else {
          System.out.print(table[row][col] + "\t");
        }
      }
      System.out.println();
    }
  }
}
