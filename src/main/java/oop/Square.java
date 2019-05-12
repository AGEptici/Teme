package oop;

public class Square extends AShape  {

    private double side;

    public Square (double side) {
        this.side = side;
    }

    public double getSide () {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
