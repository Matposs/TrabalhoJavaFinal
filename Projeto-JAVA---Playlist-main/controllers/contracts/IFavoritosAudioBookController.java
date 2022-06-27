package controllers.contracts;
import models.FavoritosAudioBook;
import java.util.ArrayList;

public interface IFavoritosAudioBookController {
    void cadastrar (FavoritosAudioBook favoritosAudioBook);

    ArrayList<FavoritosAudioBook> listar();

    FavoritosAudioBook buscaFavoritosAudioBook(String nome);

    FavoritosAudioBook remover (String nome);  
}
