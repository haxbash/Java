import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    System.out.println("Java - 3");

    // criando um arraylist de carros
    ArrayList<String> Cars = new ArrayList<>();
    Cars.add("Volvo");
    Cars.add("BMW");
    Cars.add("Ford");
    Cars.add("Ferrari");

    //  for para verificar carros (volvo e bmw)
    for (int i = 0; i < Cars.size(); i++) {
      if (Cars.get(i).equals("Volvo") || Cars.get(i).equals("BMW")) {
        System.out.println("Achamos o/a: " + Cars.get(i));
      }
    }

    //  for para imprimir todos os carros que nao sao volvo ou bmw
    for (int i = 0; i < Cars.size(); i++) {
      if (!Cars.get(i).equals("Volvo") && !Cars.get(i).equals("BMW")) {
        System.out.println("\nCarro: " + Cars.get(i));
      }
    }
    //  while para imprimir valores de x até 10
    int x = 0;
    while (x < 10) {
      x += 1;
      System.out.printf("\nO valor de x agora e %d", x);
    }

  }
}
