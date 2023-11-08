import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

    int size = 0;

    try{
      System.out.print("Please enter the size of you matrix: ");
      size = Integer.parseInt(System.console().readLine());

      // prints new line
      System.out.println();
    }
    catch(NumberFormatException e) {
      System.out.println("Entered value, " + size + " is non-integer");
      System.exit(1);
    }

    Matrix newMatrix = new Matrix(size);

    System.out.println("Printing matrix with default values: ");
    newMatrix.zeroMatrix();
    newMatrix.printMatrix();

    System.out.println();

    System.out.println("Populating matrix...matrix populated ");
    System.out.println();

    System.out.println("Printing matrix: ");
    newMatrix.populateMatrix();
    newMatrix.printMatrix();

    System.out.println();

    System.out.println("Flipping matrix...matrix flipped");
    System.out.println();

    System.out.println("Printing flipped matrix: ");
    newMatrix.flipMatrix();
    newMatrix.printMatrix();
  }
}
