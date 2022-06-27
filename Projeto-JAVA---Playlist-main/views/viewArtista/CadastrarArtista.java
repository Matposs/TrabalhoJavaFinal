package views.viewArtista;

import controllers.ArtistaController;
import utils.Console;
import models.Artista;

public class CadastrarArtista {
    
    public void compile() {
        Artista artista = new Artista();
        ArtistaController artistaController = new ArtistaController();
        System.out.println("\n -- CADASTRAR ARTISTAS: -- \n");
        artista.setArtista(Console.readString("Informe o nome do artista: "));
        // artista.setGenero(Console.readString("Informe o Gênero do Artista: "));
        artistaController.cadastrar(artista);
        System.out.println("Artista Cadastrado!");
        
    }
}
