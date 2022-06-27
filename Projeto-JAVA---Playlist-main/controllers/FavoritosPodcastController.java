package controllers;

import java.util.ArrayList;

import controllers.contracts.IFavoritosPodcastController;
import models.FavoritosPodcast;

public class FavoritosPodcastController implements IFavoritosPodcastController {

    private static ArrayList<FavoritosPodcast> favoritosPodcasts = new ArrayList<FavoritosPodcast>();

    public void cadastrar(FavoritosPodcast favoritoPodcast) {
        favoritosPodcasts.add(favoritoPodcast);
    }

    public ArrayList<FavoritosPodcast> listar() {
        return favoritosPodcasts;
    }

    public FavoritosPodcast buscarFavoritosPodcast(String nome) {
        for (FavoritosPodcast favoritoPodcastCadastrado : favoritosPodcasts) {
            if (favoritoPodcastCadastrado.getNome().toString().equals(nome)) {
                return favoritoPodcastCadastrado;
            }
        }
        return null;
    }

    public FavoritosPodcast remover(String nome) {
        for (FavoritosPodcast favoritoPodcastCadastrado : favoritosPodcasts) {
            if (favoritoPodcastCadastrado.getNome().toString().equals(nome)) {
                favoritosPodcasts.remove(favoritoPodcastCadastrado);
                return favoritoPodcastCadastrado;
            }
        }
        return null;
    }

}
