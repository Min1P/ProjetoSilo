package com;

import com.mycompany.siloiii.App;
import javafx.fxml.FXML;
import java.io.IOException;
/**
 *
 * @author Ana
 */

public class menuController {
    
    @FXML
    private void cadastrarUsuario() throws IOException{
        App.setRoot("novoUsuario");
    }
    
    @FXML
    private void listarUsuario() throws IOException{
        App.setRoot("listarUsuario");
    }
    
    @FXML
    private void alterarUsuario() throws IOException{
        App.setRoot("alterarUsuario");
    }
    
    @FXML
    private void sair(){
        System.exit(0);
    }
}