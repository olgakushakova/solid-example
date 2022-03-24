package solid.example.calculations;

import solid.example.user.interactions.UserInteraction;
import solid.example.models.Circle;
import solid.example.models.Figure;
import solid.example.models.Square;
import solid.example.models.Triangle;

public class CalculateTileArea {

    private static final Double TILE_COEFFICIENT = 1.2;

    private static UserInteraction userInteraction = new UserInteraction();

    public Double calculateTileArea(Figure figure) {

        Double paintingArea = null;

        if (figure == Figure.CIRCLE) {
            Circle circle = userInteraction.createCircleWithUserInput();
            paintingArea = calculateCircleTileArea(circle);
        } else if (figure == Figure.SQUARE) {
            Square square = userInteraction.createSquareWithUserInput();
            paintingArea = calculateSquareTileArea(square);
        } else if (figure == Figure.TRIANGLE) {
            Triangle triangle = userInteraction.createTriangleWithUserInput();
            paintingArea = calculateTriangleTileArea(triangle);
        }
        return paintingArea;
    }


    public Double calculateSquareTileArea(Square square) {

        return square.getSideLength() * square.getSideLength() * TILE_COEFFICIENT;

    }

    public double calculateCircleTileArea(Circle circle) {

        return Math.PI * circle.getRadius() * circle.getRadius() * TILE_COEFFICIENT;
    }

    public double calculateTriangleTileArea(Triangle triangle) {

        return triangle.getBaseLength() * triangle.getHeight() / 2 * TILE_COEFFICIENT;
    }
}
