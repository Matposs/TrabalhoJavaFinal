package models;

import models.contracts.ILogin;

public class Login implements ILogin{

    private String usuario;

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return 
            // "Nome: " + nomeUsuario + " | E-mail: " + email + " | Usuário: " + usuario + " | Senha: " + senha;
            " || Usuário: " + usuario + "||";
    }

}
