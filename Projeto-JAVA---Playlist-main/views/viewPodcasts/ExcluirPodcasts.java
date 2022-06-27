package views.viewPodcasts;

import controllers.PodcastController;
import utils.Console;

public class ExcluirPodcasts {

    public void remover(){
        PodcastController podcastController = new PodcastController(); 
        System.out.println("\n -- EXLCUIR PODCAST -- \n");
        podcastController.remover(Console.readString("Digite o nome do Podcast que deseja excluir: "));
        System.out.println("\n Podcast excluído com sucesso! \n");
    }
    
}
