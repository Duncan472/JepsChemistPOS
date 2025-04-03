package com.dunwam.jepschemistpos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmLloader= new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
        Scene loginScene = new Scene(fxmLloader.load());
        stage.setScene(loginScene);
        stage.setTitle("Jeps Chemist POS");
        stage.setResizable(false);
        stage.centerOnScreen();
//        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }
}
//C:\Program Files\Java\javafx-sdk-24
//--module-path "C:\Program Files\Java\javafx-sdk-24\lib" --add-modules javafx.controls,javafx.fxml
//--module-path "C:\Program Files\Java\javafx-sdk-21.0.6\lib" --add-modules javafx.controls,javafx.fxml