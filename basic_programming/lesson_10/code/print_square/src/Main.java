public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    starsSquare(15);

  }

  public static void starsSquare(int side) {
    int i;
    int j;
    for (i = 1; i <= side; i++) {
      for (j = 1; j <= side; j++) {
        if (i == 1 || j == 1 || i == side || j == side) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }

      }
      System.out.println();
    }

  }
}