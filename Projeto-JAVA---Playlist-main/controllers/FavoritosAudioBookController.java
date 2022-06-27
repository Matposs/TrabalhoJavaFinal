package controllers;
import controllers.contracts.IFavoritosAudioBookController;
import models.FavoritosAudioBook;
import java.util.ArrayList;

public class FavoritosAudioBookController implements IFavoritosAudioBookController {

    private static ArrayList<FavoritosAudioBook> favoritosAudioBooks = new ArrayList<FavoritosAudioBook>();

    public void cadastrar (FavoritosAudioBook favoritosAudioBook) {
        favoritosAudioBooks.add(favoritosAudioBook);
    }

    public ArrayList<FavoritosAudioBook> listar(){
        return favoritosAudioBooks;
    }

    public FavoritosAudioBook buscaFavoritosAudioBook (String nome) {
        for (FavoritosAudioBook favoritoAudioBookCadastrado : favoritosAudioBooks){
            if (favoritoAudioBookCadastrado.getNome().toString().equals(nome)){
                return favoritoAudioBookCadastrado;
            }
        }
    return null;
}
    public FavoritosAudioBook remover (String nome) {
        for (FavoritosAudioBook favoritoAudioBookCadastrado : favoritosAudioBooks){
            if (favoritoAudioBookCadastrado.getNome().toString().equals(nome)){
                favoritosAudioBooks.remove(favoritoAudioBookCadastrado);
                return favoritoAudioBookCadastrado;
            }
        }return null;
    }

}

