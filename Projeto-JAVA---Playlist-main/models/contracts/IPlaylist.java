package models.contracts;

import java.util.ArrayList;

import models.ItemMusica;
import models.Login;

public interface IPlaylist {

    void setNome(String nome);

    void setLogin(Login login);

    void setMusicas(ArrayList<ItemMusica> musicas);
}
