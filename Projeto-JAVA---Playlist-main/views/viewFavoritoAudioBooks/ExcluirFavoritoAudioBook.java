package views.viewFavoritoAudioBooks;
import utils.Console;
import controllers.FavoritosAudioBookController;

public class ExcluirFavoritoAudioBook {

    public void remover () {
        FavoritosAudioBookController favoritosAudioBookController = new FavoritosAudioBookController();
        System.out.println("\n -- EXCLUIR PASTA DE AUDIOBOOKS FAVORITOS --");
        favoritosAudioBookController.remover(Console.readString("Digite o nome da pasta de favoritos que deseja excluir: "));
        System.out.println("\n Pasta Favorita excluída com sucesso.");
    }
}
