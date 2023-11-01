import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

    int size;

    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter the size of you matrix: ");
    size = scan.nextInt();

    System.out.println();

    System.out.println("You matrix is " + size + " x " + size);

    System.out.println();

    //zeroMatrix();
    //printMatrix();

    //testing incrementing list
    int[][] table = new int[size][size];

    for (int row = 0; row < table.length; row++)
      for (int col = 0; col < table[row].length; col++)
        table[row][col] = 2*row+col+1;


    for (int row = 0; row < table.length; row++){
      for (int col = 0; col < table[row].length; col++)
        System.out.print(table[row][col] + "\t");
        System.out.println();
    }
  }
}
