package views.viewLogin;
import models.Login;
import controllers.LoginController;
import utils.Console;

public class CriarLogin {

    public void compilar() {

        Login login = new Login ();     
        LoginController loginController = new LoginController();
        System.out.println("\n -- CADASTRO DE USUÁRIOS -- \n");
        login.setUsuario(Console.readString("Usuário: "));
        // login.setNomeUsuario(Console.readString("Digite seu nome: "));
        // login.setEmail(Console.readString("E-mail: "));
        // login.setSenha(Console.readString("Senha: "));
        loginController.cadastro(login);
        System.out.println("\n Cadastro realizado !!!");

        
    }
    
}
