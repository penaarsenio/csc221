/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_2;

import javafx.application.Preloader;
import javafx.application.Preloader.ProgressNotification;
import javafx.application.Preloader.StateChangeNotification;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.lang.Enum;
import javafx.scene.paint.Color;

/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author Arsi
 */
public enum MyColor { 
    GREY(192, 192, 192), 
    YELLOW(255,255,0),
    RED(255, 0, 0), 
    BLUE(0,0,255),
    ORANGE(255,165,0),
    GREEN(76, 217, 100), 
    PURPLE(88, 86, 214), 
    LIGHTBLUE (52, 170, 220), //... etc, this is a shorted list 
    BLACK(0,0,0);
    
    
private Color color; 
    MyColor(int red,int green,int blue) { 
    this.color = Color.rgb(red,green,blue);
} 
    
public void setColor(int red, int green, int blue){
    this.color=Color.rgb(red,green,blue);
}
public Color getColor(){
    return this.color;
}
   
}
