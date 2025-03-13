package com.dunwam.jepschemistpos.contollers;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;

public class HomeController {
    @FXML
    private Spinner<?> cashSpinner;

    @FXML
    private Label currentCashLabel;

    @FXML
    private Label currentMpesaLabel;

    @FXML
    private Label currentStockLabel;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private LineChart<?, ?> lineChart;

    @FXML
    private Spinner<?> mpesaSpinner;

    @FXML
    private Label numberOfServicesLabel;

    @FXML
    private Label servicesTotalCashLabel;

    @FXML
    private Label servicesTotalMpesa;

    @FXML
    private Label totalCashLabel;

    @FXML
    private Label totalMpesaLabel;

    @FXML
    private Label totalRevenueLabel;

    @FXML
    private Label totalStockAddedLabel;

    @FXML
    private Button withdrawButton;
}
