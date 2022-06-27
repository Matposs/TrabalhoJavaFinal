package views.viewAudioBooks;

import controllers.AudioBookController;
import models.AudioBook;
import utils.Console;

public class CadastrarAudioBooks {

    
    public void compilar(){
        
        AudioBookController audioBookController = new AudioBookController();

        System.out.println("\n -- CADASTRO DE AUDIOBOOKS -- \n");
        String titulo, autor, genero, editora, narrador;
        double duracao;
        titulo = (Console.readString("Digite o título do áudioBook: "));
        autor = (Console.readString("Digite o nome do autor: "));
        duracao = (Console.readDouble("Digite a duração do áudioBook: "));
        genero = (Console.readString("Digite o gênero: "));
        narrador = (Console.readString("Digite o nome do narrador: "));
        editora = (Console.readString("Digite o nome da editora: "));

        AudioBook audioBook = new AudioBook (titulo, autor, duracao, genero, narrador, editora);
        audioBookController.cadastrar(audioBook);

        System.out.println("\n ÁudioBook cadastrado com sucesso !");
    }
    
}
