package controllers;

import java.util.ArrayList;

import controllers.contracts.ILoginController;
import models.Login;

public class LoginController implements ILoginController {

    private static ArrayList<Login> logins = new ArrayList<Login>();

    public void cadastro(Login login) {
        logins.add(login);
    }

    public ArrayList<Login> listar() {
        return logins;
    }

    public Login buscar(String usuario) {
        for (Login loginCadastrado : logins) {
            if (loginCadastrado.getUsuario().equals(usuario)) {
                return loginCadastrado;
            }
        }
        return null;
    }

    public Login excluirLogin(String usuario) {
        for (Login loginCadastrado : logins) {
            if (loginCadastrado.getUsuario().equals(usuario)) {
                logins.remove(loginCadastrado);
                return loginCadastrado;
            }
        }
        return null;
    }
}
