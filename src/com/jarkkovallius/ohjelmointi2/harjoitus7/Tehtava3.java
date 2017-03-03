package com.jarkkovallius.ohjelmointi2.harjoitus7;/**
 * Created by Jarkko on 3.3.2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


import java.io.IOException;

/**
 * Tehtävä	3
 Kirjoita	ohjelma (JavaFX	tai	Swing),	jossa	ikkunassa	olevaa	ympyrää	liikutetaan	eri	suuntiin
 ikkunan	alareunassa	olevien	painikkeiden	avulla.	Näille	suunnille	on	omat	painikkeet:	Ylös,
 alas,	vasemmalle,	oikealle,	yläviistoon	vasemmalle,	yläviistoon	oikealle,	alaviistoon
 vasemmalle,	alaviistoon	oikealle.	Lisäksi	on	painike,	joka	palauttaa	ympyrän	ikkunan
 keskelle.
 */
public class Tehtava3 extends Application {

    private int speed = 10;

    public static void main(String[] args) {
        launch(args);
    }

    @FXML
    Circle blueCircle ;

    private double originalX, originalY ;

    @Override
    public void start(Stage primaryStage) throws IOException {

        AnchorPane mainPane = (AnchorPane) FXMLLoader.load(Tehtava3.class.getResource("circle.fxml"));

        blueCircle = (Circle) mainPane.lookup("#blueCircle");
        originalX = blueCircle.getCenterX() ;
        originalY = blueCircle.getCenterY();

        primaryStage.setScene(new Scene(mainPane));
        primaryStage.show();


    }

    int [][] directions =
            {     //  x   y
                    {-1, -1}, // 0
                    { 0, -1}, // 1
                    { 1, -1}, // 2
                    { 1,  0}, // 3
                    { 1,  1}, // 4
                    { 0,  1}, // 5
                    {-1,  1}, // 6
                    {-1,  0}  // 7
            } ;

    @FXML
    public void onButtonPress(ActionEvent actionEvent) {
        String id = ((Node)actionEvent.getSource()).getId() ;

        String idString = id.substring("button".length());

        if (idString.equals("Clear")) {
            // return circle to original position
            blueCircle.setCenterX(originalX);
            blueCircle.setCenterY(originalY);
        } else {
            // move circle
            Integer index = Integer.parseInt(idString);
            blueCircle.setCenterX(blueCircle.getCenterX() + directions[index][0] * speed);
            blueCircle.setCenterY(blueCircle.getCenterY() + directions[index][1] * speed);
        }

        System.out.println("idString = " + idString);
    }
}
