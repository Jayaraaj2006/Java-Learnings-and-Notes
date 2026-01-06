package Assignments.oops;

public class Polymorphism {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        Shapes triangle = new Triangle();

        shape.Area();
        circle.Area();
        square.Area();
        triangle.Area();
    }

}
class Shapes{
    void Area() {
        System.out.println("The Area in Shapes");
    }
}
class Circle extends Shapes{
    @Override
    void Area() {
        System.out.println("The Circle's Area");
    }
}
class Square extends Shapes{
    @Override
    void Area() {
        System.out.println("The Square's Area");
    }
}
class Triangle extends Shapes{
    @Override
    void Area() {
        System.out.println("The Triangle's Area");
    }
}