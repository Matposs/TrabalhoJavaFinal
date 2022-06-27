package controllers.contracts;

import java.util.ArrayList;

import models.Playlist;

public interface IPlaylistController {

    void cadastrar(Playlist playlist);

    ArrayList<Playlist> listar();

    Playlist buscarPlaylist(String nome);

    Playlist remover(String nome);

}
