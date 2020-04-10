/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author Arsi
 */
public abstract class MyShape implements MyShapePosition{
    
    double x,y;
    Color color;
    
    void setX(double X){
        this.x=X;
    }
    
    void setY(double Y){
        this.y=Y;
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
    
    void getShape(){
        System.out.println("Return pointL (" + this.x + " ," + this.y + ")");
        System.out.println("The color of this shape is " + color);
    }
    
    public abstract void draw (GraphicsContext gc);
    
    @Override
    public String toString(){
        return "MyShape{" + "x=" + x + ", y=" + y + ", color='" + color + '\'' + '}';
    }
}    
    interface MyPoint{
        //public void setPoint();
        public void getPoint();
        public void moveTo(double X, double Y);
        public void distanceTo(double X, double Y);
    }
    
    interface MyShapePosition extends MyPoint{
        public void getMyBoundingBox();
        public void doOverlap(MyShape l, MyShape O);
    }

