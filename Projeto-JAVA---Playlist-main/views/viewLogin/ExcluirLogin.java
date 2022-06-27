package views.viewLogin;
import utils.Console;
import controllers.LoginController;

public class ExcluirLogin {

    public void excluirLogin() {
        LoginController loginController = new LoginController();
        System.out.println("\n -- EXCLUIR LOGIN --");
        loginController.excluirLogin(Console.readString("Digite o nome do usuário de deseja excluir: "));
        System.out.println("\n Login excluído.");
    }
}
