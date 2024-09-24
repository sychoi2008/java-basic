package oop1.ex;

public class Rectangle {
    int width;
    int height;


    void calculateArea() {
        System.out.println("Area : " + (width * height));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter : " + (2*(width+height)));
    }

    void isSquare() {
        if (width == height) {

            System.out.println("Is this square? "+ true);
        }
        else {
            System.out.println("Is this square? "+false);
        }
    }
}
