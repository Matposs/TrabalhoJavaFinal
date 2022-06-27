package models;
import java.util.ArrayList;
import models.contracts.IFavoritoPodcast;

public class FavoritosPodcast implements IFavoritoPodcast {

    public FavoritosPodcast() {
        podcasts = new ArrayList<ItemPodcast>();
		login = new Login();
    }

    private String nome;
	private Login login;
    private ArrayList<ItemPodcast> podcasts;

    public ArrayList<ItemPodcast> getPodcasts() {
		return podcasts;
	}

	public void setPodcasts(ArrayList<ItemPodcast> podcasts) {
		this.podcasts = podcasts;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return " || Pasta Podcasts Favoritos : " + nome + " || Usuário: " + login.getUsuario();
	}
    
}
