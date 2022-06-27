package controllers.contracts;

import java.util.ArrayList;

import models.Musica;

public interface IMusicaController {

    void cadastrar(Musica musica);
    ArrayList<Musica> listar();
    Musica buscarPorNome(String nome);
    Musica remover(String nome);
    
}
