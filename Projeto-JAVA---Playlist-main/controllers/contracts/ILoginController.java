package controllers.contracts;

import java.util.ArrayList;

import models.Login;

public interface ILoginController {

    void cadastro(Login login);

    ArrayList<Login> listar();

    Login excluirLogin(String usuario);

    Login buscar(String usuario);

}
