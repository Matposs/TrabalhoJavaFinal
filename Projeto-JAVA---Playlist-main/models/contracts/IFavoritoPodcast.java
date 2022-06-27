package models.contracts;
import java.util.ArrayList;

import models.ItemPodcast;
import models.Login;

public interface IFavoritoPodcast {
    void setNome(String nome);

    void setLogin(Login login);

    void setPodcasts(ArrayList<ItemPodcast> podcasts);
}
