//8.Write a Java program to create an abstract class named Shape that contains two integers and an empty method named print Area (). Provide three classes named Rectangle, Triangle, and Circle such that each one of the classes extends the class Shape. Each one of the classes contains only the method print Area () that prints the area of the given shape.
// Abstract class Shape
abstract class Shape {
    int dim1, dim2;

    // Constructor to initialize dimensions
    public Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Abstract method to be implemented by subclasses
    abstract void printArea();
}

// Rectangle class extending Shape
class Rectangle extends Shape {

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Triangle class extending Shape
class Triangle extends Shape {

    public Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}

// Circle class extending Shape
class Circle extends Shape {
    // Circle only needs radius, so dim2 is ignored (or can be set to 0)
    public Circle(int radius) {
        super(radius, 0);
    }

    @Override
    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class to test the implementation
public class MainShape {
    public static void main(String[] args) {
        // Create objects for each shape
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(8, 6);
        Shape circle = new Circle(7);

        // Print the areas of each shape
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}

