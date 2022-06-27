package models;
import java.util.ArrayList;
import models.contracts.IFavoritoAudioBook;

public class FavoritosAudioBook implements IFavoritoAudioBook {

    public FavoritosAudioBook() {
        audiobooks = new ArrayList<ItemAudioBook>();
		login = new Login();
    }

    private String nome;
	private Login login;
    private ArrayList<ItemAudioBook> audiobooks;

    public ArrayList<ItemAudioBook> getaudiobooks() {
		return audiobooks;
	}

	public void setAudioBook(ArrayList<ItemAudioBook> audiobooks) {
		this.audiobooks = audiobooks;
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
		return " || Pasta Audiobooks Favoritos : " + nome + " || Usuário: " + login.getUsuario();
	}
}

