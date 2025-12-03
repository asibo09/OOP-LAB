package it.unibo.shapes.api;

public class Triangle implements Polygon{
    private final int l1;
    private final int l2;
    private final int l3;
    private final int height;

    public Triangle(int l1, int l2, int l3,int h){
        this.l1=l1;
        this.l2=l2;
        this.l3=l3;
        this.height=h;
    }

    public int getL3() {
        return this.l3;
    }

    public int getL1() {
        return this.l1;
    }

    public int getL2() {
        return this.l2;
    }

    public int getHeight(){
        return this.height;
    }

    public double getPerimeter(){
        return this.l1+this.l2+this.l3;
    }

    public double getArea(){
        return this.l1*this.height/2;
    }

    @Override
    public int getEdgeCount() {
        return 3;
    }
}
