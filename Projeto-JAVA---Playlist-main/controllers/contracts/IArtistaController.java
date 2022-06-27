package controllers.contracts;

import models.Artista;

public interface IArtistaController {

    void cadastrar(Artista artista);

    Artista buscarPorNome(String nome);

    Artista remover(String nome);

}