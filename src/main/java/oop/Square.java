package oop;

public class Square implements IColor, IShape {

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

    public String getColor() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
