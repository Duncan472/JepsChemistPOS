package com.dunwam.jepschemistpos.controllers;

import com.dunwam.jepschemistpos.utilities.DatabaseConn;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.skin.CellSkinBase;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginController {

    @FXML
    public Label ErrorLabel;
    @FXML
    private AnchorPane AnchorPaneImage;

    @FXML
    private AnchorPane AnchorPaneLeft;

    @FXML
    private AnchorPane AnchorPaneRight;

    @FXML
    private Button CancelButton;

    @FXML
    private TextField EmailTextField;

    @FXML
    private Hyperlink ForgotPasswordHyperlink;

    @FXML
    private Button LoginButton;

    @FXML
    private AnchorPane MainPane;

    @FXML
    private PasswordField PasswordTextField;

    @FXML
    private Hyperlink Help;


    public void cancelOnAction() {
        Stage window = (Stage) CancelButton.getScene().getWindow();
        window.close();
    }

       private void checkLoginCredentials(String EmailInput, String PasswordInput) {
        DatabaseConn connection = new DatabaseConn();
        Connection connectDB = connection.getConnection();
        String verifyLogin = "SELECT count(1) FROM users WHERE email='" + EmailInput + "'AND password= '" + PasswordInput + "'";
        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);
            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    loadDashboard();
                    Stage loginWindow = (Stage) LoginButton.getScene().getWindow();
                    loginWindow.close();
                } else {
                    PasswordTextField.clear();
                    EmailTextField.clear();
                    ErrorLabel.setText("Invalid Login,Please try again!");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadDashboard() {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/FXML/dashboard.fxml"));
            Stage dashboardStage = new Stage();
            Scene dashboardScene = new Scene(fxmlLoader.load());
            dashboardStage.setScene(dashboardScene);
            dashboardStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loginOnAction(ActionEvent actionEvent) {
        if (!EmailTextField.getText().isBlank() && !PasswordTextField.getText().isBlank()) {
            String EmailInput = EmailTextField.getText();
            String PasswordInput = PasswordTextField.getText();
            System.out.println("jdjnvjn");
            checkLoginCredentials(EmailInput, PasswordInput);

        }
        else{
            ErrorLabel.setText("please enter your email and password!");
        };
    }
}