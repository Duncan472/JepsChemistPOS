package com.dunwam.jepschemistpos.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;


public class RecieveProductsController {



        @FXML
        private Button addToTableButton;

        @FXML
        private Spinner<?> buyingPriceSpinner;

        @FXML
        private Spinner<?> buyingQuantitySpinner;

        @FXML
        private DatePicker expiryDatePicker;

        @FXML
        private Spinner<?> minQuantitySpinner;

        @FXML
        private ComboBox<?> productNameComboBox;

        @FXML
        private TableView<?> productsTable;

        @FXML
        private Button saveStockButton;

        @FXML
        private Spinner<?> sellingPriceSpinner;

        @FXML
        private Spinner<?> sellingQuantitySpinner;

        @FXML
        private ComboBox<?> supplierComboBox;

        @FXML
        private Label totalBuyingPriceLabel;

    }

}
