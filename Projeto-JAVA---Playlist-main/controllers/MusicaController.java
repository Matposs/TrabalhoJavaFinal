package controllers;

import java.util.ArrayList;
import controllers.contracts.IMusicaController;
import models.Musica;

public class MusicaController implements IMusicaController{

    private static ArrayList<Musica> musicas = new ArrayList<Musica>();

    public void cadastrar(Musica musica) {
        musicas.add(musica);
    }

    
    public Musica buscarPorNome(String nome) {
        for (Musica musicaCadastrada : musicas) {
            if (musicaCadastrada.getTitulo().equals(nome)) {
                return musicaCadastrada;
            }
        }
        return null;
    }

    public Musica remover(String nome) {

        for (Musica musicaCadastrada : musicas) {
            if (musicaCadastrada.getTitulo().equals(nome)) {
                musicas.remove(musicaCadastrada);
                return musicaCadastrada;
            }
        }
        return null;
    }

    public ArrayList<Musica> listar() {
        return musicas;
    }
}
