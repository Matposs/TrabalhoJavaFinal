package models;

import java.util.ArrayList;

import models.contracts.IPlaylist;

public class Playlist implements IPlaylist {

	//na verdade nao é necessario uma classe itemmusica por duplicação de funcionalidades/agrupamento de itens
	//pois nao recebe novos parametros
	
	public Playlist() {
		musicas = new ArrayList<ItemMusica>();
		login = new Login();
	}

	private String nome;
	private Login login;
    private ArrayList<ItemMusica> musicas;


	public ArrayList<ItemMusica> getMusicas() {
		return musicas;
	}

	public void setMusicas(ArrayList<ItemMusica> musicas) {
		this.musicas = musicas;
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
		return " || Playlist : " + nome + " || Usuário: " + login.getUsuario();
	}

}
