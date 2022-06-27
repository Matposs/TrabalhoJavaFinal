package controllers.contracts;

import java.util.ArrayList;

import models.Podcast;

public interface IPodcastController {

    public void cadastrar(Podcast podcast);

    public ArrayList<Podcast> listar();

    public Podcast buscarPorNome(String nome);

    public Podcast remover(String nome);

}
