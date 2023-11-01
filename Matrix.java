public class Matrix {

  int size;
  int[][] table = new int[size][size];

  public void zeroMatrix() {
    int[][] table = new int[size][size];
    for (int row = 0; row < table.length; row++)
      for (int col = 0; col < table[row].length; col++)
        table[row][col] = 0;
  }

  public void printMatrix() {
    for (int row = 0; row < table.length; row++){
      for (int col = 0; col < table[row].length; col++)
        System.out.print(table[row][col] + "\t");
        System.out.println();
    }
  }
}
