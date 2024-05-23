package com.dunwam.jepschemistpos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmLloader= new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
        Scene loginScene = new Scene(fxmLloader.load());
        stage.setScene(loginScene);
        stage.show();
    }
}
