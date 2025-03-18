package com.dunwam.jepschemistpos.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private TextField adminEmail;

    @FXML
    private TextField adminUsername;

    @FXML
    private Label alertLabel;

    @FXML
    private Label codeAlert;

    @FXML
    private PasswordField codeTextField;

    @FXML
    private PasswordField confirmPassword;

    @FXML
    private PasswordField enterPassword;

    @FXML
    private Button getCodeButton;

    @FXML
    private Button savePassword;

}
