public class Main {
  public static void main(String[] args) {
    System.out.println("Java - 2");

    int x = 5;
    int y = 12;
    double z = 4.2;

    if (x <= y) {
      System.out.printf("%d é menor ou igual a %d", x, y);
      x = 4;
      if (x <= z) {
        System.out.printf("\n%d é menor ou igual a %.1f", x, z);
      }
    } if (x == 4) {
      System.out.printf("\nSim, %d é igual a 4", x);
    }    
  }
}
