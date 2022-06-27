package views.viewMusicas;
import controllers.MusicaController;
import models.Musica;

public class ListarMusicas {

    public void compilar(){
        MusicaController musicaController = new MusicaController();      
        System.out.println("\n -- LISTAGEM DE MÚSICAS -- \n");
        for (Musica musicaCadastrada : musicaController.listar()) {
            System.out.println(musicaCadastrada);
        }
    }
    
}
