package com.jarkkovallius.ohjelmointi2.harjoitus7;/**
 * Created by Jarkko on 3.3.2017.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Tehtava3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        AnchorPane mainPane = (AnchorPane) FXMLLoader.load(Tehtava2.class.getResource("calculator_layout.fxml"));
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.show();
    }
}
