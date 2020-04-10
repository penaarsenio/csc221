/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author Arsi
 */
public class MyCircle extends MyShape{
    double radius;
    double centerx;
    double centery;
    
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public MyCircle(double centerX, double centerY, Color Color, double Radius){
        this.centerx = centerX;
        this.centery = centerY;
        this.color = Color;
        this.radius = Radius;
    }
    public double getArea(){
        double area = PI * pow(radius,2);
        return area;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    public void draw(GraphicsContext gc){
        gc.setStroke(this.color);
        gc.strokeOval(centerx-radius,centery-radius,radius*2,radius*2);
        gc.setFill(this.color);
        gc.fillOval(centerx-radius,centery-radius,radius*2,radius*2);
    }
    
    @Override
    public String toString(){
        return "MyCircle{" + "radius=" + radius + ", centerx=" + centerx + ", centery=" + centery + '}';
    }
}