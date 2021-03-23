package com;

import com.modelo.Usuario;
import com.mycompany.siloiii.App;
import com.util.Arquivo;
import java.awt.TextField;
import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author Ana
 */
public class NovoUsuarioController {
     @FXML
    private TextField campoLogin;

    @FXML
    private TextField campoNome;

    @FXML
    private TextField campoSenha;
    
    @FXML
    private void cadastrarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setLogin(campoLogin.getText());
        usuario.setNome(campoNome.getText());
        usuario.setSenha(campoSenha.getText());
        Arquivo.inserir(usuario);
        limparCampos(); 
    }
    
    
    @FXML
    private void limparCampos(){
        this.campoLogin.setText("");
        this.campoNome.setText("");
        this.campoSenha.setText("");
    }
    @FXML
    private void voltar() throws IOException{
        App.setRoot("menu");
    }

    @FXML
    private void fechar(){
        System.exit(0); 
    }

}

