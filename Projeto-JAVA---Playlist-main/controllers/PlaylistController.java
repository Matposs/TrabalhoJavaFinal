package controllers;

import java.util.ArrayList;

import controllers.contracts.IPlaylistController;
import models.Playlist;

public class PlaylistController implements IPlaylistController {

    private static ArrayList<Playlist> playlists = new ArrayList<Playlist>();

    public void cadastrar(Playlist playlist) {
        playlists.add(playlist);
    }

    public ArrayList<Playlist> listar() {
        return playlists;
    }

    public Playlist buscarPlaylist(String nome) {
        for (Playlist playlistCadastrada : playlists) {
            if (playlistCadastrada.getNome().toString().equals(nome)) {
                return playlistCadastrada;
            }
        }
        return null;
    }

    public Playlist remover(String nome) {

        for (Playlist playlistCadastrada : playlists) {
            if (playlistCadastrada.getNome().toString().equals(nome)) {
                playlists.remove(playlistCadastrada);
                return playlistCadastrada;
            }
        }
        return null;
    }

}
