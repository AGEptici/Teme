package oop;

public interface IColor {

    String NAME = "Some name";

    String getColor();


    default int getColorCode() {
        return 123;
    }
}
