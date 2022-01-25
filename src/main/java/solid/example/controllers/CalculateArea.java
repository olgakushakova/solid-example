package solid.example.controllers;

import solid.example.models.Figure;

import java.util.Scanner;

public class CalculateArea {

    public double calculateArea (Figure figure) {

        Double area = null;

        if (figure == Figure.SQUARE) {
            area = calculateCircleArea();
        } else if (figure == Figure.SQUARE) {
            area = calculateSquareArea();
        } else if (figure == Figure.TRIANGLE) {
            area = calculateTriangleArea();
        }
        return area;
    }

    public double calculateCircleArea() {

        Double circleArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        Double radius = sn.nextDouble();

        circleArea = Math.PI * radius * radius;

        return circleArea;
    }

    public double calculateSquareArea() {

        Double squareArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter length of the square side: ");
        Double length = sn.nextDouble();

        squareArea = length * length;

        return squareArea;
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
}