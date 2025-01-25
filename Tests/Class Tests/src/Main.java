import java.util.ArrayList;
import utils.Home;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        Home home = new Home(lista);

        System.out.println("Antes do metodo removerComodo");

        home.adicionarComodo("quarto");
        home.adicionarComodo("cozinha");
        home.adicionarComodo("sala");
        home.adicionarComodo("banheiro");
        
        home.listarComodos();

        System.out.println("Depois do metodo removerComodo");

        home.removerComodo("Banheiro");
        home.removerComodo("Quintal");

        System.out.println("Depois do metodo mudarComodo");

        home.mudarComodo("quarto", "cozinha");
        home.listarComodos();


    }
}
