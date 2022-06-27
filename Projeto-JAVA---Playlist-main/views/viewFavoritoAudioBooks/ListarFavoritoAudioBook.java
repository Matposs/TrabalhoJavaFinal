package views.viewFavoritoAudioBooks;
import controllers.FavoritosAudioBookController;
import models.ItemAudioBook;
import models.FavoritosAudioBook;

public class ListarFavoritoAudioBook {
    public void listar (){
        FavoritosAudioBookController favoritosAudioBookController = new FavoritosAudioBookController();
        System.out.println("\n -- Seus Favoritos: -- \n");
        for (FavoritosAudioBook favoritosAudioBookCadastrado : favoritosAudioBookController.listar()){
            System.out.println(favoritosAudioBookCadastrado);
            for (ItemAudioBook audioBook : favoritosAudioBookCadastrado.getaudiobooks()){
                System.out.println(audioBook.getAudioBook());
            }
        }
    }
}