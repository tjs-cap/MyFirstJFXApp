package com.example.myfirstjfxapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    TextField txtFirstName;

    @FXML
    TextField txtLastName;

    @FXML
    Label lblDisplayPerson;


    Person p;

    @FXML
    protected void onHelloButtonClick() {
        p = new Person(txtFirstName.getText(), txtLastName.getText());
        System.out.println(p.getFirstName() + " " + p.getLastName());
    }

    @FXML
    protected void onDisplayButtonClick() {
        lblDisplayPerson.setText(p.getFirstName() + " " + p.getLastName());
    }

    @FXML
    protected void onResetButtonClick(){
        txtFirstName.setText("");
        txtLastName.setText("");
    }
}