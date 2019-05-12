package oop;

public class Main {

    private static void printShape(AShape shape) {
        String message = String.format(
                "%s received has perimeter: %.2f and area: %.2f",
                shape.getClass().getSimpleName(),
                shape.getPerimeter(),
                shape.getArea());

        System.out.println(message);
    }

    public static void main(String[] args) {
        AShape circle = new Circle(2);
        AShape square = new Square(3);
        AShape rectangle = new Rectangle(4, 2);

        printShape(circle);
        printShape(square);
        printShape(rectangle);
    }
}
