package views.viewArtista;

import controllers.ArtistaController;
import models.Artista;

public class ListarArtista {
    public void listar() {
        ArtistaController artistaController = new ArtistaController();
        System.out.println("\n -- LISTAGEM DE ARTISTAS -- \n");        
        for(Artista artistasCadastrados : artistaController.listar()){
            System.out.println(artistasCadastrados);
        }
    }
}