/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.awt.Toolkit;
import java.awt.Dimension;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;
import javafx.event.EventHandler;
import java.io.IOException;

public class Project_3 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Assignment 3");
        Canvas canvas = new Canvas(1500, 1200);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        BorderPane root = new BorderPane(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        //textfield so user can input the n values (number of probabilities shown)
        // the button uses the eventhandler to create the piechart when the button is clicked
        TextField text= new TextField("Enter N Value");
        Button button= new Button("Submit");
        text.setMaxWidth(100);
        root.setTop(text);
        root.setLeft(button);
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                int n = Integer.parseInt(text.getText());
                //tests the piechart class using various values of n.
                HistogramAlphaBet hist = new HistogramAlphaBet();
                MyPieChart c = new MyPieChart();
                try {
                    c.draw(gc,hist,n);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        };
        button.setOnAction(event);

    }

    public static void main(String[] args){
        launch(args);
    }
}