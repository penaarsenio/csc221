/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_1;

import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import java.util.Arrays;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Simple Preloader Using the ProgressBar Control
 *
 * @author Arsi
 */
public class MyPolygon extends MyShape {
    int numPoints;
    
    double xpoints[] = {0,0,0,0,0,0};
    double ypoints[] = {0,0,0,0,0,0};
    double radius;
    double x=0;
    double y=0;
    double centerx;
    double centery;
    Color color;
    
    public MyPolygon(double centerX, double centerY, double Radius, Color C, int points){
        this.centery = centerY;
        this.centerx = centerX;
        this.color = C;
        this.numPoints = points;
        this.radius = Radius;
        double angle = (2*PI)/ numPoints;
        
        for(int i=0;i<numPoints;i++){
            xpoints[i] = centerx+radius*-sin(i*angle);
            ypoints[i] = centery+radius*-cos(i*angle);
        }
    }
    public double getArea(){
        double side = sqrt(pow(xpoints[0]-xpoints[1],2)-pow(ypoints[0]-ypoints[1],2));
        return (3/2)*sqrt(3)*pow(side,2);
    }
    public double getPerimeter(){
        double side = sqrt(pow(xpoints[0]-xpoints[1],2)-pow(ypoints[0]-ypoints[1],2));
        return 6*side;
    }
    public double getAngle(){
        return 120;
    }
    public double getSide(){
        return sqrt(pow(xpoints[0]-xpoints[1],2)-pow(ypoints[0]-ypoints[1],2));
    }
    public void draw(GraphicsContext gc){
        gc.setFill(this.color);
        gc.strokePolygon(xpoints,ypoints, xpoints.length);
        gc.fillPolygon(xpoints,ypoints,numPoints);
    }
    @Override
    public String toString(){
        return "MyPolygon{" + "numPoints=" + numPoints + ", xpoints=" + Arrays.toString(xpoints) + ", ypoints=" + Arrays.toString(ypoints) + 
                ", radius=" + radius + ", x=" + x + ", y=" + y +", centerx=" + centerx + ", centery" + centery + ", color=" + color + '}';
    }
}