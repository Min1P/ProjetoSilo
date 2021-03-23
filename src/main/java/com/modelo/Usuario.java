package com.modelo;

import java.io.Serializable;

/**
 *
 * @author Ana
 */
public class Usuario implements Serializable {
    String login;
    String nome;
    String senha;

public Usuario(){
    this.login = "";
    this.nome = "";
    this.senha = "";
    }
public Usuario (String login, String nome, String senha){
    this.login = login;
    this.nome = nome;
    this.senha = senha;
}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
 @Override
    public String toString(){
        return this.nome; 
    }
}
