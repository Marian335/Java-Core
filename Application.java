package ua.OOP.Classes;

public class Application {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        double square;
        double perimeter;
        square = myRectangle.width * myRectangle.length;
        perimeter = (myRectangle.width + myRectangle.length)*2;
        System.out.println("The area is equal = " + square);
        System.out.println("The perimeter is equal = " + perimeter);


        Circle myCircle = new Circle();
        double squareCircle;
        double lengthCircle;
        squareCircle = (myCircle.diameter * myCircle.diameter)* Math.PI;
        lengthCircle = myCircle.radius * 2 * Math.PI;
        System.out.println("The square circle is equal = " + squareCircle);
        System.out.println("The length circle is equal = " + lengthCircle);
    }
}
