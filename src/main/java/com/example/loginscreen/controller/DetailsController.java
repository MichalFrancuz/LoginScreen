package com.example.loginscreen.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DetailsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label detailsAge;

    @FXML
    private Label detailsGitHub;

    @FXML
    private Label detailsMail;

    @FXML
    private Label detailsName;

    @FXML
    private Label detailsProfession;

    @FXML
    private Label detailsWelcomeLabel;

    @FXML
    void initialize() {

    }

    void setName(String name) {
        detailsWelcomeLabel.setText("Welcome " + name);
        detailsName.setText("Name: " + name);

    }

}
