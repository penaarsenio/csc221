/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Arrays;

import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.PI;

/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author Arsi
 */
public class MyPolygon extends MyShape {
    
    int numPoints;
    
    double xpoints[] = {0,0,0,0,0};
    double ypoints[] = {0,0,0,0,0};
    double radius;
    double x=0;
    double y=0;
    double centerx;
    double centery;
    Color color;
    
    public MyPolygon(double centerX, double centerY, double Radius, Color C, int points){
        this.centerx=centerX;
        this.centery=centerY;
        this.color=C;
        this.numPoints = points;
        this.radius = Radius;
        double angle = (2*PI)/numPoints;
        
        for(int i=0;i<numPoints;i++){
            xpoints[i] = centerx+radius*-sin(i*angle);
            ypoints[i] = centery+radius*-cos(i*angle);
        }
    }
    
    public void setPoint(double X, double Y){
        this.centerx = X;
        this.centery = Y;
    }
    
    public void getPoint(){
        System.out.println("The point for this oval is " + "(" + centerx + " ," + centery + ")");
    }
    
    public void moveTo(double X, double Y){
        centerx = this.centerx + X;
        centery = this.centery + Y;
    }
    
    public void distanceTo(double X, double Y){
        double distanceX = centerx - X;
        double distanceY = centery - Y;
        System.out.println("Distance for X is: " + distanceX);
        System.out.println("Distance for Y is: " + distanceY);
    }
    
    public void getMyBoundingBox(){
        System.out.println("Bounding box is provided by coordinates: " + "(" + this.getX() + " ," + this.getY() + ")");
    }
    
    public void doOverlap(MyShape P, MyShape O){
        if(O.getX() == P.getX()){{
            System.out.println("The shapes overlap");
        }
            if(O.getY() == P.getX()){
                System.out.println("The shapes overlap");
            }
        }
        else
            System.out.println("Shapes do not overlap");
    }
    
    public void draw(GraphicsContext gc){
        gc.setFill(this.color);
        gc.strokePolygon(xpoints,ypoints,xpoints.length);
        gc.fillPolygon(xpoints,ypoints,numPoints);
    }
    
    @Override
    public String toString(){
        return "MyPolygon{" + "numPoints=" + numPoints + ", xpoints=" + Arrays.toString(xpoints) + 
                ", ypoints=" + Arrays.toString(ypoints) + ", radius=" + radius + ", x=" + x + ", y=" + 
                y + ", centerx=" + centerx + ", centery=" + centery + ", color=" + color + '}';
    }
}
