package utils;
import java.util.ArrayList;

public class Home {
  
  private ArrayList <String> list = new ArrayList < > ();
  
  public Home(ArrayList <String> list) {
    this.list = list;
  }
  
  public void listarComodos() {
    if (list.isEmpty()) {
            System.out.println("Nenhum cômodo encontrado.");
            return;
          }
          for (int i = 0; i < list.size(); i++) {
            System.out.println("Cômodo: " + list.get(i));
          }
        }

        public void mudarComodo(String comodo1, String comodo2) {

          //fixed

          if (list.contains(comodo1) && list.contains(comodo2)) {
              int x = list.indexOf(comodo1);
              int y = list.indexOf(comodo2);
      
              String temp = list.get(x);
              list.set(x, list.get(y));
              list.set(y, temp);
          }
      }
      
    public void adicionarComodo(String comodo) {

        comodo = comodo.toLowerCase();

        if (!list.contains(comodo)) {
            list.add(comodo);
            System.out.println("Comodo: " + comodo + " adicionado com sucesso!");
            return;
        }
        System.err.println("Este comodo ja existe");
    }

    public void removerComodo(String comodo) {
        comodo = comodo.toLowerCase();

        if (list.contains(comodo)) {
            list.remove(comodo);
            System.out.println("Comodo: " + comodo + " removido com sucesso!");
            return;
        }
        System.err.println("Este comodo nao existe existe");
    }
}