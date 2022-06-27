package views.viewPodcasts;

import controllers.PodcastController;
import models.Podcast;
import utils.Console;

public class CadastrarPodcasts {

    public void compilar(){
        
        PodcastController podcastController = new PodcastController();

        System.out.println("\n -- CADASTRO DE PODCASTS -- \n");
        String titulo, autor, genero, convidado, patrocinador;
        double duracao;
        titulo = (Console.readString("Digite o título do podcast: "));
        autor = (Console.readString("Digite o nome do autor: "));
        duracao = (Console.readDouble("Digite a duração do podcast: "));
        genero = (Console.readString("Digite o gênero: "));
        convidado = (Console.readString("Digite o nome do convidado: "));
        patrocinador = (Console.readString("Digite o nome do patrocinador: "));

        Podcast podcast = new Podcast (titulo, autor, duracao, genero, convidado, patrocinador);
        podcastController.cadastrar(podcast);

        System.out.println("\n ÁudioBook cadastrado com sucesso !");
    }
    
}
