package com.example.increase_decrease;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class HelloController {

    @FXML
    private Label number;

    private int num=0;

    @FXML
    void increase_buttonOnAction(ActionEvent event) {
        num = num+1;
        String Text = Integer.toString(num);
        number.setText(Text);
    }
    @FXML
    void decrease_buttonOnAction(ActionEvent event) {
        num = num-1;
        String Text = Integer.toString(num);
        number.setText(Text);
    }

}