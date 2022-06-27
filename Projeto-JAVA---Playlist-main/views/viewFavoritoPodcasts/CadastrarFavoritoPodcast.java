package views.viewFavoritoPodcasts;

import models.FavoritosPodcast;
import models.ItemPodcast;
import models.Login;
import models.Podcast;
import controllers.FavoritosPodcastController;
import controllers.LoginController;
import controllers.PodcastController;
import utils.Console;

public class CadastrarFavoritoPodcast {
    public void cadastrar() {

        FavoritosPodcast favoritosPodcast = new FavoritosPodcast();
        ItemPodcast pf = new ItemPodcast();
        PodcastController podcastController = new PodcastController();
        FavoritosPodcastController favoritosPodcastController = new FavoritosPodcastController();
        LoginController loginController = new LoginController();

        System.out.println("\n -- CRIAÇÃO DA PASTA DE PODCASTS FAVORITOS -- \n");

        favoritosPodcast.setNome(Console.readString("Digite o nome da pasta de favoritos: "));

        String criador = Console.readString("Informe o nome do usuário: ");
        Login usuario = loginController.buscar(criador);
        if (usuario != null) {
            favoritosPodcast.setLogin(usuario);

            do {

                pf = new ItemPodcast();
                String nomeVersao = Console.readString("Digite o podcast que deseja adicionar: ");
                Podcast podcast = podcastController.buscarPorNome(nomeVersao);
                if (podcast != null) {
                    pf.setPodcasts(podcast);
                    favoritosPodcast.getPodcasts().add(pf);
                } else {
                    System.out.println("Podcast não encontrado");
                }

            } while (Console.readString("Deseja adicionar mais Podcasts? Digite S ou N").toUpperCase().equals("S"));

            favoritosPodcastController.cadastrar(favoritosPodcast);
            System.out.println("Podcast cadastrado!");

        } else {
            System.out.println("Usuário não encontrado!");
        }

    }
}