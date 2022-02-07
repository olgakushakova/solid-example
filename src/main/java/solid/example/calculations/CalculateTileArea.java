package solid.example.calculations;

import solid.example.user.interactions.UserInteraction;
import solid.example.models.Circle;
import solid.example.models.Figure;
import solid.example.models.Square;
import solid.example.models.Triangle;

public class CalculateTileArea extends CalculateArea {

    private static final Double CIRCLE_AND_TRIANGLE_COEFFICIENT_TILE = 1.2;
    private static final Double SQUARE_COEFFICIENT_TILE = 1.1;

    private static UserInteraction userInteraction = new UserInteraction();

    public Double calculateTileArea(Figure figure) {

        Double paintingArea = null;

        if (figure == Figure.CIRCLE) {
            Circle circle = userInteraction.createCircleWithUserInput();
            paintingArea = super.calculateCircleArea(circle) * CIRCLE_AND_TRIANGLE_COEFFICIENT_TILE;
        } else if (figure == Figure.SQUARE) {
            Square square = userInteraction.createSquareWithUserInput();
            paintingArea = super.calculateSquareArea(square) * SQUARE_COEFFICIENT_TILE;
        } else if (figure == Figure.TRIANGLE) {
            Triangle triangle = userInteraction.createTriangleWithUserInput();
            paintingArea = super.calculateTriangleArea(triangle) * CIRCLE_AND_TRIANGLE_COEFFICIENT_TILE;
        }
        return paintingArea;
    }
}
