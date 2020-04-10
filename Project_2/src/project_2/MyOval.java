/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author Arsi
 */
public class MyOval extends MyShape {
    
    double radius;
    double centerx;
    double centery;
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public void setCenterx(double centerx){
        this.centerx = centerx;
    }
    
    public void setCentery(double centery){
        this.centery = centery;
    }
    
    public double getArea(){
        return PI * pow(radius,2);
    }
    
    public double getPerimeter(){
        return 2 * PI * radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getCenterx(){
        return centerx;
    }
    
    public double getCentery(){
        return centery;
    }
    
    public MyOval(){}
    
    public MyOval(double centerX, double centerY, Color C, double Radius){
        this.setX(centerX);
        this.setY(centerY);
        this.setColor(C);
        this.setRadius(Radius);
    }
    
    public void setPoint(double X, double Y){
        this.centerx = X;
        this.centery = Y;
    }
    
    public void getPoint(){
        System.out.println("The point for this oval is " + "(" + this.getCenterx() + " ," + this.getCentery() + ")");
    }
    
    public void moveTo(double X, double Y){
        centerx = this.getCenterx() + X;
        centery = this.getCentery() + Y;
    }
    
    public void distanceTo(double X, double Y){
        double distanceX = centerx - X;
        double distanceY = centery - Y;
        System.out.println("Distance for X is: " + distanceX);
        System.out.println("Distance for Y is: " + distanceY);
    }
    
    public void getMyBoundingBox(){
        System.out.println("Bounding box is provided by coordinates: " + "(" + this.getCenterx() + " ," + this.getCentery() + ")");
    }
    
    public void doOverlap(MyShape R, MyShape O){
        if(O.getX() == R.getX()){{
            System.out.println("The shapes overlap");
        }
            if (O.getY() == R.getX()){
                System.out.println("The shapes overlap");
            }
        }
        else
            System.out.println("Shapes do not overlap");
    }
    
    public void draw(GraphicsContext gc){
        gc.strokeOval(this.getX(),this.getY(),this.getRadius()*2,this.getRadius()*1.20);
        gc.setFill(this.getColor());
        gc.fillOval(this.getX(),this.getY(),getRadius()*2,getRadius()*1.20);
    }
}
