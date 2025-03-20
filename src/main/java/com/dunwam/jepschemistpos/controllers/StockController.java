package com.dunwam.jepschemistpos.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class StockController {

    @FXML
    private Button addStockButton;

    @FXML
    private Spinner<?> buyingPriceSpinner;

    @FXML
    private DatePicker expiryDatePicker;

    @FXML
    private Button iconSearch;

    @FXML
    private Spinner<?> minQuantitySpinner;

    @FXML
    private ComboBox<?> nameComboBox;

    @FXML
    private TextArea optionalDescription;

    @FXML
    private Spinner<?> quantitySpinner;

    @FXML
    private ImageView refreshIcon;

    @FXML
    private Button saveButton;

    @FXML
    private TextField searchTextfield;

    @FXML
    private Spinner<?> sellingPriceSpinner;

    @FXML
    private ComboBox<?> supplierComboBox;

}
