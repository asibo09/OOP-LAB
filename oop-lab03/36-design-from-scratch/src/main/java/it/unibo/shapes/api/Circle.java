package it.unibo.shapes.api;
import java.lang.Math;

public class Circle implements Shape{
    private final int raggio;

    public Circle(int r){
        this.raggio=r;
    }

    public double getPerimeter(){
        return 2*Math.PI*this.raggio;
    }

    public double getArea(){
        return Math.PI*this.raggio*this.raggio;
    }

    public int getRaggio() {
        return raggio;
    }

    
}
