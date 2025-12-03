package it.unibo.shapes.api;



public class WorkWithShapes{
    
public static void main(String[] args) {
    
    Shape circle=new Circle(5);
    Shape rectangle= new Rectangle(6, 14);
    Shape square = new Square(6);
    Shape triangle = new Triangle(3, 9, 18,9);

    System.out.println("Cerchio -> perimetro: "+circle.getPerimeter()+ ", area: " + circle.getArea());
    System.out.println("Rettangolo -> perimetro: " + rectangle.getPerimeter()+", area: " +rectangle.getArea());
    System.out.println("Quadrato -> perimetro: "+square.getPerimeter()+", area: "+square.getArea());
    System.out.println("Triangolo -> perimetro: "+triangle.getPerimeter()+", area: "+triangle.getArea());


}


}
