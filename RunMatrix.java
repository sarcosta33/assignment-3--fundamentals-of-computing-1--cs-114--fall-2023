import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

    int size;

    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter the size of you matrix: ");
    size = scan.nextInt();

    System.out.println();

    System.out.println("You matrix is " + size + " x " + size);
  }
}
