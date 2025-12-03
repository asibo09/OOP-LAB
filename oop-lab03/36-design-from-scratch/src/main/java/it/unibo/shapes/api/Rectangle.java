package it.unibo.shapes.api;

public class Rectangle implements Polygon{
    private final int base;
    private final int height;

    public Rectangle(int b, int h){
        this.base=b;
        this.height=h;
    }

    public int getBase() {
        return this.base;
    }

    public int getHeight() {
        return this.height;
    }

    public double getPerimeter(){
        return (this.base+this.height) *2;
    }

    public double getArea(){
        return this.base*this.height;
    }

    @Override
    public int getEdgeCount() {
        return 4;
    }
}
