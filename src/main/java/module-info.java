module com.mycompany.siloiii {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.siloiii to javafx.fxml;
    exports com.mycompany.siloiii;
}
