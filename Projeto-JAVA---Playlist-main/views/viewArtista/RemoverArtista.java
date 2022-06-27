
package views.viewArtista;
import controllers.ArtistaController;
import utils.Console;

public class RemoverArtista {
    
    public void remover(){
        ArtistaController artistaController = new ArtistaController();
        System.out.println("\n -- REMOVER ARTISTA -- \n");
        artistaController.remover(Console.readString("Digite o nome do Artista a ser removido: "));
        System.out.println("\n Artista Removido.");
    }
}