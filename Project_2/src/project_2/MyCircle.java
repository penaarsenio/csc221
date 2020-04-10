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
public class MyCircle extends MyOval {
    
    public MyCircle(double centerX, double centerY, Color Color, double Radius){
        this.setCenterx(centerX);
        this.setCentery(centerY);
        this.setColor(Color);
        this.setRadius(Radius);
    }    
    
    public void draw(GraphicsContext gc){
        gc.setStroke(getColor());
        gc.strokeOval(getCenterx(),getCentery(),getRadius()*2,getRadius()*2);
        gc.setFill(getColor());
        gc.fillOval(getCenterx(),getCentery(),getRadius()*2,getRadius()*2);
    }
    
    @Override
    public String toString(){
        return "MyCircle{" + "radius=" + radius + ", centerx=" + centerx + ", centery=" + centery + '}';
    }
}
