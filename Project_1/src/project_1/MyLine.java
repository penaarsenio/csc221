/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import static java.lang.Math.atan;


/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author Arsi
 */
public class MyLine extends MyShape {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private Color strokeColor;
    
    public MyLine(double X1,double X2,double Y1,double Y2,Color StrokeColor) {
        this.x1=X1;
        this.x2=X2;
        this.y1=Y1;
        this.y2=Y2;
        this.strokeColor=StrokeColor;
    }
    public double getLength(){
        double length = sqrt(pow((x1-x2),2)-pow((y1-y2),2));
        return length;
    }
    public double get_xAngle(){
        double slope = (y2-y1)/(x2-x1);
        return atan(slope);
    } 
    public void draw (GraphicsContext gc){
        gc.setStroke(strokeColor);
        gc.strokeLine(x1, y1, x2, y2);
    }
    
    @Override
    public String toString(){
        return "MyLine{" + "x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + ", strokeColor=" + strokeColor + '}';
    }
}