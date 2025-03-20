package com.dunwam.jepschemistpos.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ServicesController {

    @FXML
    private Spinner<?> ageSpinner;

    @FXML
    private TextField cashPaymentTextField;

    @FXML
    private TextArea contactInfoTextArea;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private AnchorPane femaleRadioButton;

    @FXML
    private RadioButton maleRadioButton;

    @FXML
    private TextField mpesaPaymentTextField;

    @FXML
    private TextField patientName;

    @FXML
    private TextField residenceTextField;

    @FXML
    private Button saveButton;

    @FXML
    private ScrollPane scrollPane;

}
