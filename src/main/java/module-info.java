module com.dunwam.jepschemistpos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dunwam.jepschemistpos to javafx.fxml;
    exports com.dunwam.jepschemistpos;
}