package com.jarkkovallius.ohjelmointi2.harjoitus7;/**
 * Created by Jarkko on 3.3.2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;


public class Tehtava2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    TextField textFieldCalculation ;

    @FXML
    TextField textFieldResult ;

    @Override
    public void start(Stage primaryStage) throws IOException {
        AnchorPane mainPane = (AnchorPane) FXMLLoader.load(Tehtava2.class.getResource("calculator_layout.fxml"));
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.show();

        textFieldCalculation = (TextField) mainPane.lookup("#calculation");
        textFieldResult = (TextField) mainPane.lookup("#result");
    }



    @FXML
    public void onButtonPress(ActionEvent actionEvent) {
        System.out.println("onButtonPress");
        if (actionEvent.getSource() instanceof Button) {
            Button button = (Button) actionEvent.getSource();
            //System.out.println("button=" + button.getText());

            if (button.getText().equals("C")) {
                // clear
                textFieldCalculation.setText("");
                textFieldResult.setText("");

            } else if (!button.getText().equals("=")) {
                textFieldCalculation.setText(textFieldCalculation.getText() + button.getText());

            } else {
                textFieldResult.setText(calculate(textFieldCalculation.getText()));
            }
        }

    }



    private String calculate(String text) {
        char [] operators = {'+', '-', '*', '/'};

        System.out.println("text="+text);
        double result = 0 ;
        String [] numberArray ;
        int operatorIndex = -1 ;


        // find operator
        for (int i = 0; i < operators.length; i++) {
            if (text.contains(String.valueOf(operators[i]))) {
                operatorIndex = i ;
                break ;
            }
        }


        if (operatorIndex != -1) {

            // split text string
            String s = "["+ String.valueOf(operators[operatorIndex]) + "]" ;
            numberArray = text.split(s);

            // calculate
            Integer firstNumber = Integer.parseInt(numberArray[0]);
            Integer secondNumber = Integer.parseInt(numberArray[1]);

            switch (operatorIndex) {
                case 0 : // +
                    result = firstNumber + secondNumber ;
                    break ;
                case 1 : // -
                    result = firstNumber - secondNumber ;
                    break ;
                case 2 : // *
                    result = firstNumber * secondNumber ;
                    break ;
                case 3 : // /
                    result = firstNumber / (double)secondNumber ;
                    break ;
            }

        }



        return String.valueOf(result);
    }
}
