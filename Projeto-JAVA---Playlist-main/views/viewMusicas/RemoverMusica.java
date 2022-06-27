package views.viewMusicas;
import controllers.MusicaController;
import utils.Console;

public class RemoverMusica {

    public void remover(){
        MusicaController musicaController = new MusicaController(); 
        System.out.println("\n -- REMOVER MÚSICA -- \n");
        musicaController.remover(Console.readString("Digite o nome da música que deseja remover: "));
        System.out.println("\nMúsica removida com sucesso!!! \n");
    }
    
}