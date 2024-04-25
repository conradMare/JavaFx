package com.example.javafxapplication;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

   @FXML
    private Label label;

   @FXML
    public void initialize() {
       label.setScaleX(2.0);
       label.setScaleY(2.0);
   }
}