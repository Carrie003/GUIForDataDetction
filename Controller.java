package sample;

import javafx.fxml.FXML;
import javafx.scene.text.*;
import javafx.event.ActionEvent;
public class Controller {



    @FXML private Text actiontarget;


    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");

    }
//
//    @FXML protected void handeSubmitButtonAction(ActionEvent event) {
//        actiontarget.setText("Sign in button pressed");
//
//    }
//
//





}
