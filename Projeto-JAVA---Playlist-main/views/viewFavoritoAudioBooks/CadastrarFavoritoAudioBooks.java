package views.viewFavoritoAudioBooks;
import models.AudioBook;
import models.FavoritosAudioBook;
import models.Login;
import models.ItemAudioBook;
import controllers.FavoritosAudioBookController;
import controllers.LoginController;
import controllers.AudioBookController;
import utils.Console;

public class CadastrarFavoritoAudioBooks {
        public void cadastrar () {
            FavoritosAudioBook favoritosAudioBook = new FavoritosAudioBook();
            ItemAudioBook pa = new ItemAudioBook();
            AudioBookController audioBookController = new AudioBookController();
            FavoritosAudioBookController favoritosAudioBookController = new FavoritosAudioBookController();
            LoginController loginController = new LoginController();
            
            System.out.println("\n -- CRIAÇÃO DA PASTA DE AUDIOBOOKS FAVORITOS -- \n");
            favoritosAudioBook.setNome(Console.readString("Digite o nome da pasta de favoritos: "));

            String criador = Console.readString("Informe o nome do usuário: ");
            Login usuario = loginController.buscar(criador);
            if (usuario != null) {
                favoritosAudioBook.setLogin(usuario);
                
                do {
                    pa = new ItemAudioBook();
                    String nomeVersao = Console.readString("Digite o audiobook que deseja adicionar: ");
                    AudioBook audiobook = new AudioBookController().buscarPorNome(nomeVersao);
                    if (audiobook != null){
                        pa.setAudibook(audiobook);
                        favoritosAudioBook.getaudiobooks().add(pa);}
                        else {
                            System.out.println("AudioBook não encontrado");
                        }
                    } while (Console.readString("Deseja adicionar mais AudioBooks? Digite S ou N").toUpperCase().equals("S"));
                    favoritosAudioBookController.cadastrar(favoritosAudioBook);
                    System.out.println("AudioBook cadastrado!");
                } else {
                    System.out.println("Usuário não encontrado!");
                }
            }

        }
