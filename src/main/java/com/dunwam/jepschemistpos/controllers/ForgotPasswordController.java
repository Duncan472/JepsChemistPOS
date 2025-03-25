package com.dunwam.jepschemistpos.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ForgotPasswordController {

    @FXML
    private TextField adminEmailTextfield;

    @FXML
    private Label codeAlert;

    @FXML
    private PasswordField confirmNewPassword;

    @FXML
    private Label emailAlert;

    @FXML
    private TextField emailCodeTextfield;

    @FXML
    private TextField emailToChangePassword;

    @FXML
    private PasswordField enterNewPassword;

    @FXML
    private Button getCodeButton;

    @FXML
    private Button setNewPasswordButton;

}
