package views.viewPlaylist;

import models.Playlist;
import models.ItemMusica;
import models.Login;
import models.Musica;
import controllers.PlaylistController;
import controllers.LoginController;
import controllers.MusicaController;
import utils.Console;

public class CadastrarPlaylist {

    public void cadastrar() {

        Playlist playlist = new Playlist();
        ItemMusica mp = new ItemMusica();
        MusicaController musicaController = new MusicaController();
        PlaylistController playlistController = new PlaylistController();
        LoginController loginController = new LoginController();

        System.out.println("\n -- CRIAÇÃO DE PLAYLISTS -- \n");

        playlist.setNome(Console.readString("Digite o nome da playlist: "));

        String criador = Console.readString("Informe o nome do usuário: ");
        Login usuario = loginController.buscar(criador);
        if (usuario != null) {
            playlist.setLogin(usuario);

            do {

                mp = new ItemMusica();
                String nomeVersao = Console.readString("Digite a música que deseja adicionar: ");
                Musica musica = musicaController.buscarPorNome(nomeVersao);
                if (musica != null) {
                    mp.setMusica(musica);
                    playlist.getMusicas().add(mp);
                } else {
                    System.out.println("Música não encontrada");
                }

            } while (Console.readString("Deseja adicionar mais Músicas? Digite S ou N").toUpperCase().equals("S"));

            playlistController.cadastrar(playlist);
            System.out.println("Música cadastrada!");

        } else {
            System.out.println("Usuário não encontrado!");
        }

    }
}