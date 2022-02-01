package solid.example.controllers;

import solid.example.models.Figure;

import java.util.Scanner;

public class CalculateArea {

    public Double calculateArea (Figure figure) {

        Double area = null;

        if (figure == Figure.CIRCLE) {
            area = calculateCircleArea();
        } else if (figure == Figure.SQUARE) {
            area = calculateSquareArea();
        } else if (figure == Figure.TRIANGLE) {
            area = calculateTriangleArea();
        } else if (figure == Figure.RECTANGLE) {
            area = calculateRectangleArea();
        }
        return area;
    }


    public double calculateSquareArea() {

        Double squareArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter length of the square side: ");
        Double length = sn.nextDouble();

        squareArea = length * length;

        return squareArea;
    }

    public double calculateCircleArea() {

        Double circleArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        Double radius = sn.nextDouble();

        circleArea = Math.PI * radius * radius;

        return circleArea;
    }

    public double calculateTriangleArea() {

        Double triangleArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the length of the triangle base: ");
        Double length = sn.nextDouble();
        System.out.println("Enter the length of the triangle height: ");
        Double height = sn.nextDouble();

        triangleArea = length * height / 2;

        return triangleArea;
    }

    public double calculateRectangleArea() {

        Double rectangleArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        Double length = sn.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        Double height = sn.nextDouble();

        rectangleArea = length * height;

        return rectangleArea;
    }

    public double calculateSquareAreaForDecoration() {

        Double squareArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter length of the square side: ");
        Double length = sn.nextDouble();

        squareArea = length * length * 1.1;

        return squareArea;
    }

    public double calculateCircleAreaForDecoration() {

        Double circleArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        Double radius = sn.nextDouble();

        circleArea = Math.PI * radius * radius * 1.2;

        return circleArea;
    }

    public double calculateTriangleAreaForDecoration() {

        Double triangleArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the length of the triangle base: ");
        Double length = sn.nextDouble();
        System.out.println("Enter the length of the triangle height: ");
        Double height = sn.nextDouble();

        triangleArea = length * height / 2 * 1.2;

        return triangleArea;
    }

    public double calculateRectangleAreaForDecoration() {

        Double rectangleArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle base: ");
        Double length = sn.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        Double height = sn.nextDouble();

        rectangleArea = length * height * 1.1;

        return rectangleArea;
    }
}