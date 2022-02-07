package solid.example;

import solid.example.models.Figure;

import java.util.Scanner;

public class CalculateTileArea {

    private static final Double CIRCLE_AND_TRIANGLE_COEFFICIENT_TILE = 1.2;
    private static final Double SQUARE_COEFFICIENT_TILE = 1.1;

    public Double calculateTileArea(Figure figure) {

        Double paintingArea = null;

        if (figure == Figure.CIRCLE) {
            paintingArea = calculateCircleTileArea();
        } else if (figure == Figure.SQUARE) {
            paintingArea = calculateSquareTileArea();
        } else if (figure == Figure.TRIANGLE) {
            paintingArea = calculateTriangleTileArea();
        }
        return paintingArea;
    }


    public double calculateSquareTileArea() {

        Double squareArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter length of the square side: ");
        Double length = sn.nextDouble();

        squareArea = length * length * SQUARE_COEFFICIENT_TILE;

        return squareArea;
    }

    public double calculateCircleTileArea() {

        Double circleArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        Double radius = sn.nextDouble();

        circleArea = Math.PI * radius * radius * CIRCLE_AND_TRIANGLE_COEFFICIENT_TILE;

        return circleArea;
    }

    public double calculateTriangleTileArea() {

        Double triangleArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the length of the triangle base: ");
        Double length = sn.nextDouble();
        System.out.println("Enter the length of the triangle height: ");
        Double height = sn.nextDouble();

        triangleArea = length * height / 2 * CIRCLE_AND_TRIANGLE_COEFFICIENT_TILE;

        return triangleArea;
    }
}
