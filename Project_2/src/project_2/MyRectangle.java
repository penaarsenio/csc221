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
public class MyRectangle extends MyShape {
    
    double length;
    double width;
    double pointX;
    double pointY;
    double area;
    double perimeter;
    
    public MyRectangle(double X, double Y, double W, double L, Color C){
        this.setX(X);
        this.setY(Y);
        this.length = L;
        this.width = W;
        this.setColor(C);
        pointX = getX();
        pointY = getY();
    }
    
    public void getPoint(){
        System.out.println("The points for where this rectangle is drawn is" + "(" + this.getX() + " ," + this.getY() + ")");
    }
    
    public void setArea(){
        this.area = length * width;
    }
    
    public double getArea(){
        return area;
    }
    
    public void setPerimeter(){
        this.perimeter = (2 * length) + (2 * width);
    }
    
    public double getPerimeter(){
        return perimeter;
    }
    
    public void setPoint(double X, double Y){
        this.pointX = X;
        this.pointY = Y;
    }
    
    public void moveTo(double X, double Y){
        double pointX = this.getX() + X;
        double pointY = this.getY() + Y;
    }
    
    public void distanceTo(double X, double Y){
        double distanceX = pointX - X;
        double distanceY = pointY - Y;
        System.out.println("Distance for X is: " + distanceX);
        System.out.println("Distance for Y is: " + distanceY);
    }
    
    public void getMyBoundingBox(){
        System.out.println("Bounding box is provided by coordinates: " + "(" + this.getX() + " ," + this.getY() + ")");
    }
    
    public void doOverlap(MyShape R, MyShape O){
        if (O.getX() == R.getX()){
            System.out.println("The shapes overlap");
        }
            if (O.getY() == R.getY()){
                System.out.println("The shapes overlap");
            }
            else
                System.out.println("Shapes do not overlap");
    }
    
    public void draw(GraphicsContext gc){
        gc.setFill(this.getColor());
        gc.strokeRect(this.getX(),this.getY(),width,length);
        gc.fillRect(this.getX(),this.getY(),width,length);
    }
}
