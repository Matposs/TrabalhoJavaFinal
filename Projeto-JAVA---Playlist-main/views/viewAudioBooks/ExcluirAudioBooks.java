package views.viewAudioBooks;

import controllers.AudioBookController;
import utils.Console;

public class ExcluirAudioBooks {

    public void remover(){
        AudioBookController audioBookController = new AudioBookController(); 
        System.out.println("\n -- EXLCUIR AUDIOBOOK -- \n");
        audioBookController.remover(Console.readString("Digite o nome do ÁudioBook que deseja excluir: "));
        System.out.println("\n ÁudioBook excluído com sucesso! \n");
    }
    
}
