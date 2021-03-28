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
        textField1.setText("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <title>Document</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <a href='http://ya.ru'>Яндекс</a>\n" +
                "    <a href='http://ya.ru/maps'>Яндекс карты</a>\n" +
                "    <a href='http://www.google.ru/search?hl=ru&client=firefox&hs=mpE&rls=en'>Поиск</a>\n" +
                "    <p>Много много текста а подробнее можно посмотреть тут http://podrobnee.ru</p>\n" +
                "</body>\n" +
                "</html>");
        button.setOnAction(actionEvent -> {
            RegWork regWork = new RegWork(textField1.getText());
            textField2.setText(regWork.outRegString());
        });
    }
}
