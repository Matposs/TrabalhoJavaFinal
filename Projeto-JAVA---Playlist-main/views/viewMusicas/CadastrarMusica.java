package views.viewMusicas;
import controllers.ArtistaController;
import controllers.MusicaController;
import models.Musica;
import utils.Console;
import models.Artista;

public class CadastrarMusica {

    public void compilar(){
        
        ArtistaController artistaController = new ArtistaController();
        MusicaController musicaController = new MusicaController();

        System.out.println("\n -- CADASTRO DE MÚSICAS -- \n");
        String titulo, autor, interprete, genero;
        double duracao;
        titulo = (Console.readString("Digite o nome da música: "));
        autor = (Console.readString("Digite o nome do compositor: "));
        duracao = (Console.readDouble("Digite a duração da música: "));
        interprete = (Console.readString("Digite o nome do artista: "));
        Artista artista = artistaController.buscarPorNome(interprete);
        if(artista == null){
            do {
                interprete = (Console.readString("Artista inexistente digite novamente: "));
                artista = artistaController.buscarPorNome(interprete);
            } while (artista == null);
        }
        genero = (Console.readString("Informe o gênero: "));
        Musica musica = new Musica(titulo, autor, duracao, artista, genero);
        musicaController.cadastrar(musica);

        System.out.println("\nMúsica cadastrada com sucesso !!!");
    }
    
}
