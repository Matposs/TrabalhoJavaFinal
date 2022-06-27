package views.viewFavoritoPodcasts;
import utils.Console;
import controllers.FavoritosPodcastController;
public class ExcluirFavoritoPodcast {
    public void remover() {
        FavoritosPodcastController favoritosPodcastController = new FavoritosPodcastController();
        System.out.println("\n -- EXCLUIR PASTA DE PODCASTS FAVORITOS --");
        favoritosPodcastController.remover(Console.readString("Digite o nome da pasta de favoritos que deseja excluir: "));
        System.out.println("\n Pasta Favorita excluída com sucesso.");
    }
}
