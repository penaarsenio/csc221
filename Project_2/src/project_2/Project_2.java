/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Arsi
 */
public class Project_2 extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Canvas canvas = new Canvas(1000,600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        StackPane canvasHolder = new StackPane(canvas);
        BorderPane root = new BorderPane(canvasHolder);
        primaryStage.setTitle("Drawing shapes");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        double canvasW = canvas.getWidth();
        double canvasH = canvas.getHeight();
        
        MyLine line = new MyLine(0,canvas.getWidth(),0,canvas.getHeight(),MyColor.BLACK.getColor());
        MyLine line1 = new MyLine(0,canvas.getWidth(),canvas.getHeight(),0,MyColor.BLACK.getColor());
        MyLine lineRight = new MyLine(canvas.getWidth(),canvas.getWidth(),canvas.getHeight(),0,MyColor.BLACK.getColor());
        MyLine lineLeft = new MyLine(0,0,canvas.getHeight(),0,MyColor.BLACK.getColor());
        MyLine lineBottom = new MyLine(0,canvas.getWidth(),canvas.getHeight(),canvas.getHeight(),MyColor.BLACK.getColor());
        MyLine lineTop = new MyLine(0,canvas.getWidth(),0,0,MyColor.BLACK.getColor());
        
        lineRight.draw(gc);
        lineLeft.draw(gc);
        lineTop.draw(gc);
        lineBottom.draw(gc);
        
        MyRectangle rectangle = new MyRectangle(canvasW/4,canvasH/4,canvasW/2,canvasH/2,MyColor.BLUE.getColor());
        MyRectangle rectangle1 = new MyRectangle(canvasW/3.1,canvasH/3.1,canvasW/2.82,canvasH/2.82,MyColor.YELLOW.getColor());
        MyRectangle rectangle2 = new MyRectangle(canvasW/2.67,canvasH/2.67,canvasW/4,canvasH/4,MyColor.LIGHTBLUE.getColor());
        
        MyOval oval = new MyOval(canvasW/4,canvasH/4,MyColor.GREY.getColor(),canvasW/4);
        MyOval oval1 = new MyOval(canvasW/3.1,canvasH/3.1,MyColor.PURPLE.getColor(),canvasW/5.65);
        MyOval oval2 = new MyOval(canvasW/2.67,canvasH/2.67,MyColor.ORANGE.getColor(),canvasW/8);
        
        rectangle.draw(gc);
        oval.draw(gc);
        rectangle1.draw(gc);
        oval1.draw(gc);
        rectangle2.draw(gc);
        oval2.draw(gc);
        line.draw(gc);
    }
}
