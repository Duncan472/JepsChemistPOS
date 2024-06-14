package com.dunwam.jepschemistpos.contollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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



    public void cancelOnAction(){
        Stage window = (Stage) CancelButton.getScene().getWindow();
                            window.close();
    }

    public void loginOnAction(ActionEvent actionEvent) {
        if(!EmailTextField.getText().isBlank() && !PasswordTextField.getText().isBlank()){
            System.out.println("Login Successful");

        }
        else{
            ErrorLabel.setText("Please enter your email and password");
        }
    }
}
