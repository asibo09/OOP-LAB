package it.unibo.shapes.api;

public class Square implements Polygon {

    private final int side;

    public Square(int s){
        this.side=s;
    }

    public int getEdgeCount() { 
        return 4;
    }

    @Override
    public double getPerimeter() {
        return this.side*4;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    public int getSide() {
        return this.side;
    }
}
