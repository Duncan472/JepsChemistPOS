module com.dunwam.jepschemistpos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;


    opens com.dunwam.jepschemistpos to javafx.fxml;
    exports com.dunwam.jepschemistpos;
    exports com.dunwam.jepschemistpos.controllers;
    opens com.dunwam.jepschemistpos.controllers to javafx.fxml;
}