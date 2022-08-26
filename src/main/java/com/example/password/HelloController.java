package com.example.password;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label L;

    @FXML
    protected void onHelloButtonClick() {
        L.setText("Welcome to JavaFX Application!");
    }

//    public void opperationClicked(ActionEvent actionEvent) {
//        Button btP = (Button) actionEvent.getSource();
//        String id = btP.idProperty().getValue();


//    this.Label.setText(this.Label.getText() + b.getText());
//    this.Label.setVisible(false); //WHY IS NOT WORKING

    }
//}
