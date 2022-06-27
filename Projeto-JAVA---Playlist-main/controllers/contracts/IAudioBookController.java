package controllers.contracts;

import java.util.ArrayList;

import models.AudioBook;

public interface IAudioBookController {

    public void cadastrar(AudioBook aBook);

    public ArrayList<AudioBook> listar();

    public AudioBook buscarPorNome(String nome);

    public AudioBook remover(String nome);
}
