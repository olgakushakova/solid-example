package solid.example.calculations;

import solid.example.user.interactions.UserInteraction;
import solid.example.models.Circle;
import solid.example.models.Figure;
import solid.example.models.Square;
import solid.example.models.Triangle;

public class CalculateArea {

    private static CalculatePaintingArea calculatePaintingArea = new CalculatePaintingArea();
    private static CalculateTileArea calculateTileArea = new CalculateTileArea();

    private static UserInteraction userInteraction = new UserInteraction();

    public Double calculateArea(Figure figure, String areaType) {

        Double area = null;

        if (areaType == "simple") {
            if (figure == Figure.CIRCLE) {
                Circle circle = userInteraction.createCircleWithUserInput();
                area = calculateCircleArea(circle);
            } else if (figure == Figure.SQUARE) {
                Square square = userInteraction.createSquareWithUserInput();
                area = calculateSquareArea(square);
            } else if (figure == Figure.TRIANGLE) {
                Triangle triangle = userInteraction.createTriangleWithUserInput();
                area = calculateTriangleArea(triangle);
            }
        } else if (areaType == "painting") {
            area = calculatePaintingArea.calculatePaintingArea(figure);
        } else if (areaType == "tile") {
            area = calculateTileArea.calculateTileArea(figure);
        }
        return area;
    }


    public Double calculateSquareArea(Square square) {

        return square.getSideLength() * square.getSideLength();
    }

    public double calculateCircleArea(Circle circle) {

        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    public double calculateTriangleArea(Triangle triangle) {

        return triangle.getFirstSideLength() * triangle.getSecondSideLength() / 2
                * Math.sin(triangle.getFirstAndSecondSidesAngle());
    }
}