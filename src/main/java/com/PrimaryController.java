package com;

import com.mycompany.siloiii.App;
import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author Ana
 */
public class PrimaryController {
      @FXML
    private  void  switchToSecondary () throws  IOException {
        App . setRoot ( " secundário " );
    }
}
