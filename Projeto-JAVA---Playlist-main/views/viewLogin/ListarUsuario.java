package views.viewLogin;
import models.Login;
import controllers.LoginController;

public class ListarUsuario {
    public void listar(){
        LoginController loginController = new LoginController();      
        System.out.println("\n -- USUÁRIOS: -- \n");
        for (Login loginCadastrado : loginController.listar()) {
            System.out.println(loginCadastrado);
        }
    }
    
}
