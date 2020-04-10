/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Arrays;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.PI;

/**
 *
 * @author Arsi
 */



public class Project_1 extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    // Creating the window where the canvas will go
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        StackPane canvasHolder = new StackPane(canvas);
        BorderPane root = new BorderPane(canvasHolder);
        primaryStage.setTitle("Drawing shapes");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // Setting the dimensions of the canvas to local variables
        
        double canvasW = canvas.getWidth();
        double canvasH = canvas.getHeight();
                
        
        // Creating Lines
        MyLine line = new MyLine(0, canvas.getWidth(),0,canvas.getHeight(),MyColor.BLACK.getColor());
        MyLine line1 = new MyLine(0, canvas.getWidth(),canvas.getHeight(),0,MyColor.BLACK.getColor());
        MyLine lineRight = new MyLine(canvas.getWidth(),canvas.getWidth(),canvas.getHeight(),0,MyColor.BLACK.getColor());
        MyLine lineLeft = new MyLine(0,0,canvas.getHeight(),0,MyColor.BLACK.getColor());
        MyLine lineBottom = new MyLine(0, canvas.getWidth(),canvas.getHeight(),canvas.getHeight(),MyColor.BLACK.getColor());
        MyLine lineTop = new MyLine(0, canvas.getWidth(),0,0,MyColor.BLACK.getColor());
        
        // Creating Circles
        MyCircle circle = new MyCircle(canvasW/2,canvasH/2,MyColor.RED.getColor(),(canvasW)/3.45);
        MyCircle circle1 = new MyCircle(canvasW/2,canvasH/2,MyColor.RED.getColor(),(canvasW)/4);
        MyCircle circle2 = new MyCircle(canvasW/2,canvasH/2,MyColor.LIGHTBLUE.getColor(),(canvasW)/4.65);
        
        // Creating Polygons
        MyPolygon poly = new MyPolygon(canvasW/2,canvasH/2,circle.getRadius(),MyColor.ORANGE.getColor(),6);
        MyPolygon poly1 = new MyPolygon(canvasW/2,canvasH/2,circle1.getRadius(),MyColor.GREY.getColor(),6);
        MyPolygon poly2 = new MyPolygon(canvasW/2,canvasH/2,circle2.getRadius(),MyColor.PURPLE.getColor(),6);
        MyPolygon poly3 = new MyPolygon(canvasW/2,canvasH/2,circle.getRadius()*1.0125,MyColor.BLACK.getColor(),6);
        
        // Drawing Circles and Polygons
        poly3.draw(gc);
        poly.draw(gc);
        circle1.draw(gc);
        poly1.draw(gc);
        circle2.draw(gc);
        poly2.draw(gc);
        
        // Drawing Lines
        line.draw(gc);
        line1.draw(gc);
        lineRight.draw(gc);
        lineLeft.draw(gc);
        lineTop.draw(gc);
        lineBottom.draw(gc);
   
    }
}
