package views;

import utils.Console;
import views.viewArtista.CadastrarArtista;
import views.viewArtista.ListarArtista;
import views.viewArtista.RemoverArtista;
import views.viewAudioBooks.CadastrarAudioBooks;
import views.viewAudioBooks.ExcluirAudioBooks;
import views.viewAudioBooks.ListarAudioBooks;
import views.viewLogin.CriarLogin;
import views.viewMusicas.CadastrarMusica;
import views.viewMusicas.ListarMusicas;
import views.viewMusicas.RemoverMusica;
import views.viewPlaylist.CadastrarPlaylist;
import views.viewPlaylist.ExcluirPlaylist;
import views.viewPlaylist.ListarPlaylist;
import views.viewPodcasts.CadastrarPodcasts;
import views.viewPodcasts.ExcluirPodcasts;
import views.viewPodcasts.ListarPodcasts;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0, opcaoAdm = 0, opcaoUser = 0;

        do {
            System.out.println("\n -- SOUND APLICATION -- \n");
            System.out.println("1 - Login administrador");
            System.out.println("2 - Login usuário");
            System.out.println("0 - Sair");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao) {
                case 1:
                    do {
                        System.out.println("\n -- ADMIN LOGIN -- \n");
                        System.out.println("1 - Cadastrar artista");
                        System.out.println("2 - Listar artista");
                        System.out.println("3 - Remover artista");
                        System.out.println("4 - Cadastrar música");
                        System.out.println("5 - Listar música");
                        System.out.println("6 - Remover música");
                        System.out.println("7 - Cadastrar áudioBook");
                        System.out.println("8 - Listar áudioBook");
                        System.out.println("9 - Remover áudioBook");
                        System.out.println("10 - Cadastrar podcast");
                        System.out.println("11 - Listar podcast");
                        System.out.println("12 - Remover podcast");
                        System.out.println("0 - Voltar\n");

                        opcaoAdm = Console.readInt("Digite uma opção: ");

                        switch (opcaoAdm) {
                            case 1:
                                CadastrarArtista cadastrarArtista = new CadastrarArtista();
                                cadastrarArtista.compile();
                                break;
                            case 2:
                                ListarArtista listarArtistas = new ListarArtista();
                                listarArtistas.listar();
                                break;
                            case 3:
                                RemoverArtista removerArtista = new RemoverArtista();
                                removerArtista.remover();
                                break;
                            case 4:
                                CadastrarMusica cadastrarMusica = new CadastrarMusica();
                                cadastrarMusica.compilar();
                                break;
                            case 5:
                                ListarMusicas listarMusicas = new ListarMusicas();
                                listarMusicas.compilar();
                                break;
                            case 6:
                                RemoverMusica removerMusica = new RemoverMusica();
                                removerMusica.remover();
                                break;
                            case 7:
                                CadastrarAudioBooks cadastrarAudioBooks = new CadastrarAudioBooks();
                                cadastrarAudioBooks.compilar();
                                break;
                            case 8:
                                ListarAudioBooks listarAudioBooks = new ListarAudioBooks();
                                listarAudioBooks.compilar();
                                break;
                            case 9:
                                ExcluirAudioBooks excluirAudioBooks = new ExcluirAudioBooks();
                                excluirAudioBooks.remover();
                                break;
                            case 10:
                                CadastrarPodcasts cadastrarPodcasts = new CadastrarPodcasts();
                                cadastrarPodcasts.compilar();
                                break;
                            case 11:
                                ListarPodcasts listarPodcasts = new ListarPodcasts();
                                listarPodcasts.compilar();
                                break;
                            case 12:
                                ExcluirPodcasts excluirPodcasts = new ExcluirPodcasts();
                                excluirPodcasts.remover();
                                break;
                            case 0:
                                System.out.println("\n -- SAINDO -- \n");
                                break;
                            default:
                                System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                                break;
                        }

                    } while (opcaoAdm != 0);

                case 2:
                    do {
                        System.out.println("\n -- USER LOGIN -- \n");
                        System.out.println("1 - Cadastrar login");
                        System.out.println("2 - Criar playlist");
                        System.out.println("3 - Listar playlist");
                        System.out.println("4 - Remover playlist");
                        System.out.println("0 - Voltar\n");

                        opcaoUser = Console.readInt("Digite uma opção: ");

                        switch (opcaoUser) {
                            case 1:
                                CriarLogin criarLogin = new CriarLogin();
                                criarLogin.compilar();
                                break;
                            case 2:
                                CadastrarPlaylist cadastrarPlaylist = new CadastrarPlaylist();
                                cadastrarPlaylist.cadastrar();
                                break;
                            case 3:
                                ListarPlaylist listarPlaylist = new ListarPlaylist();
                                listarPlaylist.listar();
                                break;
                            case 4:
                                ExcluirPlaylist excluirPlaylist = new ExcluirPlaylist();
                                excluirPlaylist.remover();
                                break;
                            case 0:
                                System.out.println("\n -- SAINDO -- \n");
                                break;

                            default:
                                System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                                break;
                        }

                    } while (opcaoUser != 0);

                default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
            }
        } while (opcao != 0);
    }
}