package Question_83;

public abstract class Shape {

    abstract double calculateArea();

    public static void main(String[] args) {

        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Square area: " + square.calculateArea());
    }
}

class Circle extends Shape {

    double radius;

    public Circle(double rad) {
        this.radius = rad;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}
