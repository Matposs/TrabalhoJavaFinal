package views.viewPodcasts;

import controllers.PodcastController;
import models.Podcast;

public class ListarPodcasts {

    public void compilar(){
        PodcastController podcastController = new PodcastController();      
        System.out.println("\n -- LISTAGEM DE ÁUDIOBOOK -- \n");
        for (Podcast podcastCadastrado : podcastController.listar()) {
            System.out.println(podcastCadastrado);
        }
    }
    
}
