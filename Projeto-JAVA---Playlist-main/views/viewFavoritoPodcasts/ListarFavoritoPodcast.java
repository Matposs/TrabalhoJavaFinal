package views.viewFavoritoPodcasts;

import controllers.FavoritosPodcastController;
import models.ItemPodcast;
import models.FavoritosPodcast;
public class ListarFavoritoPodcast {
    public void listar(){
        FavoritosPodcastController favoritosPodcastController = new FavoritosPodcastController();      
        System.out.println("\n -- Seus Favoritos: -- \n");
        for (FavoritosPodcast favoritosPodcastCadastrado : favoritosPodcastController.listar()) {
            System.out.println(favoritosPodcastCadastrado);
            for (ItemPodcast podcast : favoritosPodcastCadastrado.getPodcasts()){
                System.out.println(podcast.getPodcast());

            }
        }
    }
}