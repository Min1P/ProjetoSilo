package com;

import com.mycompany.siloiii.App;
import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author Ana
 */
public class SecondaryController {
     @FXML
    private  void  switchToPrimary () throws  IOException {
        App.setRoot (" primário" );
}
