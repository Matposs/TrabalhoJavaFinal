package views.viewAudioBooks;

import controllers.AudioBookController;
import models.AudioBook;

public class ListarAudioBooks {

    public void compilar(){
        AudioBookController audioBookController = new AudioBookController();      
        System.out.println("\n -- LISTAGEM DE ÁUDIOBOOK -- \n");
        for (AudioBook audioBookCadastrado : audioBookController.listar()) {
            System.out.println(audioBookCadastrado);
        }
    }
    
}
