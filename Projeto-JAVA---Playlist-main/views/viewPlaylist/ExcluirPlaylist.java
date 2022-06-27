package views.viewPlaylist;
import utils.Console;
import controllers.PlaylistController;

public class ExcluirPlaylist {
    public void remover() {
        PlaylistController playlistController = new PlaylistController();
        System.out.println("\n -- EXCLUIR PLAYLIST --");
        playlistController.remover(Console.readString("Digite o nome da playlist que deseja excluir: "));
        System.out.println("\n Playlist excluída excluído.");
    }
    
}
