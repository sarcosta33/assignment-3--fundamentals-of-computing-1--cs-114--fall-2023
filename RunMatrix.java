public class RunMatrix {
  public static void main(String[] args) {

    int size = 0;

    try{
      System.out.print("Please enter the size of your matrix: ");
      size = Integer.parseInt(System.console().readLine());

      // prints new line
      System.out.println();
    }
    catch(NumberFormatException exception) {
      System.out.println("Entered value is not an integer!");
      System.exit(1);
    }

    Matrix newMatrix = new Matrix(size);
    // prints new line
    System.out.println();

    System.out.println("Printing matrix with default values: ");
    newMatrix.zeroMatrix();
    newMatrix.printMatrix();

    // prints new line
    System.out.println();

    System.out.println("Populating matrix...matrix populated ");
    // prints new line
    System.out.println();
    newMatrix.populateMatrix();
    System.out.println("Printing matrix: ");
    newMatrix.printMatrix();

    // prints new line
    System.out.println();

    System.out.println("Flipping matrix...matrix flipped");
    // prints new line
    System.out.println();
    newMatrix.flipMatrix();
    System.out.println("Printing flipped matrix: ");
    newMatrix.printMatrix();
  }
}
