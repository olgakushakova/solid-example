package solid.example;

import solid.example.models.Figure;

import java.util.Scanner;

public class CalculateTileArea {

    private static final Double TILE_COEFFICIENT = 1.2;

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

        squareArea = length * length * TILE_COEFFICIENT;

        return squareArea;
    }

    public double calculateCircleTileArea() {

        Double circleArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        Double radius = sn.nextDouble();

        circleArea = Math.PI * radius * radius * TILE_COEFFICIENT;

        return circleArea;
    }

    public double calculateTriangleTileArea() {

        Double triangleArea;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the length of the triangle base: ");
        Double length = sn.nextDouble();
        System.out.println("Enter the length of the triangle height: ");
        Double height = sn.nextDouble();

        triangleArea = length * height / 2 * TILE_COEFFICIENT;

        return triangleArea;
    }
}
