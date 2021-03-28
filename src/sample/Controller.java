package sample;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea textField1;

    @FXML
    private TextArea textField2;

    @FXML
    private Button button;

    @FXML
    void initialize() {
        button.setOnAction(actionEvent -> {
            RegWork regWork = new RegWork(textField1.getText());
            textField2.setText(regWork.outRegString());
        });
    }
}
