package solid.example;

import solid.example.models.Figure;

import java.util.Scanner;

public class CalculateArea {

    public Double calculateArea(Figure figure, String areaType) {

        Double area = null;

        if (areaType == "simple") {
            if (figure == Figure.CIRCLE) {
                area = calculateCircleArea();
            } else if (figure == Figure.SQUARE) {
                area = calculateSquareArea();
            } else if (figure == Figure.TRIANGLE) {
                area = calculateTriangleArea();
            }
        } else if (areaType == "decoration") {
            if (figure == Figure.CIRCLE) {
                area = calculateCircleAreaForDecoration();
            } else if (figure == Figure.SQUARE) {
                area = calculateSquareAreaForDecoration();
            } else if (figure == Figure.TRIANGLE) {
                area = calculateTriangleAreaForDecoration();
            }
        }
        return area;
    }


    public Double calculateSquareArea() {

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
}