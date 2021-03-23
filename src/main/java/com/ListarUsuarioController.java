package com;

import com.modelo.Usuario;
import com.mycompany.siloiii.App;
import com.util.Arquivo;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Ana
 */
public class ListarUsuarioController {
    
    @FXML
    private TableView<Usuario> tabela;
    @FXML
    private TableColumn<Usuario, String> colunaNome;
    @FXML
    private TableColumn<Usuario, String> colunaLogin;

    private List<Usuario> usuarios;

    private ObservableList<Usuario> listaUsuarios; 

        @FXML
        public void initialize() {
        usuarios = Arquivo.listar();    
        colunaNome = new TableColumn("Nome");   
        colunaLogin = new TableColumn("Login");
        colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));   
        colunaLogin.setCellValueFactory(new PropertyValueFactory<>("login"));        
        tabela.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);        
        listaUsuarios = FXCollections.observableArrayList(usuarios);         
        tabela.getColumns().addAll(colunaNome, colunaLogin);
        tabela.setItems(listaUsuarios);                                   
    }

    @FXML
    private void menu() throws IOException {
        App.setRoot("menu");
    }

    public TableView<Usuario> getTabela() {
        return tabela;
    }

    public void setTabela(TableView<Usuario> tabela) {
        this.tabela = tabela;
    }

    public TableColumn<Usuario, String> getColunaNome() {
        return colunaNome;
    }

    public void setColunaNome(TableColumn<Usuario, String> colunaNome) {
        this.colunaNome = colunaNome;
    }

    public TableColumn<Usuario, String> getColunaLogin() {
        return colunaLogin;
    }

    public void setColunaLogin(TableColumn<Usuario, String> colunaLogin) {
        this.colunaLogin = colunaLogin;
    }

    public ObservableList<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(ObservableList<Usuario> listaUsuario) {
        this.listaUsuario=listaUsuario;
    }

    public List<Usuario> getUsuario() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuario) {
        this.usuario = usuario;
    }

}