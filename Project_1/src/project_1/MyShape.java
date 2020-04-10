/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author Arsi
 */
public abstract class MyShape{
    static double x,y;
    Color color;
    
    void setX(double X){
        this.x = X;
    }
    
    void setY(double Y){
        this.y = Y;
    }
    void setColor(Color C){
        this.color = C;
    }
    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }
    Color getColor(){
        return this.color;
    }
    
    public abstract void draw (GraphicsContext gc);
    
    @Override
    public String toString(){
        return "MyShape{"+"x="+x+", y="+y+", y="+y+", color='" + color + '\'' + '}';
    }
}