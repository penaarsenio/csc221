/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_3;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import java.io.IOException;

public class MyPieChart {
    //draw a piechart, takes a HistogramLetters object as a parameter.
    public void draw(GraphicsContext g,HistogramAlphaBet H,int n)throws IOException {
        double remainder = 1.0;
        double totalValue = 0.0;
        double startAngle;
        double arcAngle;
        int y = 50; // y coordinate for label
        int xCord = 500; //  x coordinate for color key
        int yCord = 30; // y coordinate for color key
        g.fillText("Legend ",580,20);

        for(int i = 0; i < n; i++) {
            startAngle = ((totalValue * 360)); // Calculate the start angle for each segment
            // Calculate the arc angle for each segment. Uses the probabilites by converting the values of the map into an array
            //that can be traversed.
            arcAngle = (((H.getMap()).get((H.getMap()).keySet().toArray()[i]) * 360)+0.7);
            // Set the color and draw the sector
            g.setFill(Color.color(Math.random(), Math.random(), Math.random()));
            g.fillArc(60,100,400,400,startAngle,arcAngle, ArcType.ROUND);
            //calculate the sum of all the frequencies through every iteration
            totalValue += (H.getMap()).get((H.getMap()).keySet().toArray()[i]);
            //draw a rectangle with same color as the sector, and print the corresponding key and value of that sector next to it.
            g.fillRect(xCord,yCord,40,20);
            g.fillText("= "+ ((H.getMap()).keySet().toArray()[i]) + ": " + (H.getMap()).get((H.getMap()).keySet().toArray()[i]), 560, y);
            //add 50 to the y coordinate of the rectangle and the text to give padding for the next iteration.
            yCord += 30;
            y += 30;
        }
        //calculate the remainder by subtracting 1 from the total probabilities of the other sectors.
        //draw the final sector
        remainder -= totalValue;
        startAngle =((totalValue * 360)+ 0.5);
        arcAngle = ((remainder * 360)+ 0.5);
        g.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        g.fillArc(60,100,400,400,startAngle,arcAngle,ArcType.ROUND);
        g.fillRect(xCord,yCord,50,30);
        g.fillText("= other: " + remainder, 560, y);
    }
}