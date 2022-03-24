package solid.example;

import solid.example.models.Figure;

import java.util.Scanner;

public class CalculatePaintingArea {

    private static final Double PAINTING_COEFFICIENT = 1.1;

    public Double calculatePaintingArea(Figure figure) {

        Double paintingArea = null;

        if (figure == Figure.CIRCLE) {
            paintingArea = calculateCirclePaintingArea();
        } else if (figure == Figure.SQUARE) {
            paintingArea = calculateSquarePaintingArea();
        } else if (figure == Figure.TRIANGLE) {
            paintingArea = calculateTrianglePaintingArea();
        }
        return paintingArea;
    }


    public double calculateSquarePaintingArea() {

        Double squareArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter length of the square side: ");
        Double length = sn.nextDouble();

        squareArea = length * length * PAINTING_COEFFICIENT;

        return squareArea;
    }

    public double calculateCirclePaintingArea() {

        Double circleArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        Double radius = sn.nextDouble();

        circleArea = Math.PI * radius * radius * PAINTING_COEFFICIENT;

        return circleArea;
    }

    public double calculateTrianglePaintingArea() {

        Double triangleArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the length of the triangle base: ");
        Double length = sn.nextDouble();
        System.out.println("Enter the length of the triangle height: ");
        Double height = sn.nextDouble();

        triangleArea = length * height / 2 * PAINTING_COEFFICIENT;

        return triangleArea;
    }
}
