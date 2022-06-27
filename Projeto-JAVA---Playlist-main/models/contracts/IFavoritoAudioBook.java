package models.contracts;
import models.Login;
import models.ItemAudioBook;
import java.util.ArrayList;

public interface IFavoritoAudioBook {
    void setNome(String nome);

    void setLogin(Login login);

    void setAudioBook(ArrayList<ItemAudioBook> audioBooks);
}

