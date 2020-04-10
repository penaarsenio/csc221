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
public class MyLine extends MyShape {
    
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private Color strokeColor;
    
    public MyLine(double X1, double X2, double Y1, double Y2, Color StrokeColor){
        this.x1=X1;
        this.x2=X2;
        this.y1=Y1;
        this.y2=Y2;
        this.strokeColor= StrokeColor;
    }
    
    public void draw(GraphicsContext gc){
        gc.setStroke(strokeColor);
        gc.strokeLine(x1,y1,x2,y2);
    }
    
    public void setPoint(double X1, double Y1, double X2, double Y2){
        this.x1 = X1;
        this.y1 = Y1;
        this.x2 = X2;
        this.y2 = Y2;
    }
    
    public void getPoint(){
        System.out.println("The point for this oval is " + "(" + x1 + " ," + y1 + ")" + " (" + x2 + ", " + y2 + ")");
    }
    
    public void moveTo(double X, double Y){}
    
    public void distanceTo(double X, double Y){}
    
    public void setPoint(){}
    
    public void getMyBoundingBox(){
        System.out.println("Bounding box is provided by coordinates: " + "(" + this.getX() + " ," + this.getY() + ")");
    }
    
    public void doOverlap(MyShape L, MyShape O){
        if(O.getX()==L.getX()){{
            System.out.println("The shapes overlap");
        }
            if (O.getY()==L.getX()){
                System.out.println("The shapes overlap");
            }
        }
        else
            System.out.println("Shapes do not overlap");
    }
    
    @Override
    public String toString() {
        return "MyLine{" + "x1=" + x1 + ", x2=" + x2 + ", y1= " + y1 + ", y2=" + y2 + ", strokeColor=" + strokeColor + '}';
    }
}
