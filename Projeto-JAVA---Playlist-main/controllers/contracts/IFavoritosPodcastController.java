package controllers.contracts;
import java.util.ArrayList;
import models.FavoritosPodcast;

public interface IFavoritosPodcastController {
    void cadastrar(FavoritosPodcast favoritoPodcasts);

    ArrayList<FavoritosPodcast> listar();

    FavoritosPodcast buscarFavoritosPodcast(String nome);

    FavoritosPodcast remover(String nome);
}
