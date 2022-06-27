package controllers;

import java.util.ArrayList;

import controllers.contracts.IAudioBookController;
import models.AudioBook;

public class AudioBookController implements IAudioBookController {

    private static ArrayList<AudioBook> aBooks = new ArrayList<AudioBook>();

    public void cadastrar(AudioBook aBook) {
        aBooks.add(aBook);
    }

    public ArrayList<AudioBook> listar() {
        return aBooks;
    }

    public AudioBook buscarPorNome(String nome) {
        for (AudioBook aBookCadastrado : aBooks) {
            if (aBookCadastrado.getTitulo().equals(nome)) {
                return aBookCadastrado;
            }
        }
        return null;
    }

    public AudioBook remover(String nome) {

        for (AudioBook aBookCadastrado : aBooks) {
            if (aBookCadastrado.getTitulo().equals(nome)) {
                aBooks.remove(aBookCadastrado);
                return aBookCadastrado;
            }
        }
        return null;
    }

}
