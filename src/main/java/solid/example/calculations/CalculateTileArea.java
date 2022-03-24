package solid.example.calculations;

import solid.example.user.interactions.UserInteraction;
import solid.example.models.Circle;
import solid.example.models.Figure;
import solid.example.models.Square;
import solid.example.models.Triangle;

public class CalculateTileArea extends CalculateArea {

    private static final Double TILE_COEFFICIENT = 1.2;

    private static UserInteraction userInteraction = new UserInteraction();

    public Double calculateTileArea(Figure figure) {

        Double paintingArea = null;

        if (figure == Figure.CIRCLE) {
            Circle circle = userInteraction.createCircleWithUserInput();
            paintingArea = calculateCircleArea(circle) * TILE_COEFFICIENT;
        } else if (figure == Figure.SQUARE) {
            Square square = userInteraction.createSquareWithUserInput();
            paintingArea = calculateSquareArea(square) * TILE_COEFFICIENT;
        } else if (figure == Figure.TRIANGLE) {
            Triangle triangle = userInteraction.createTriangleWithUserInput();
            paintingArea = calculateTriangleArea(triangle) * TILE_COEFFICIENT;
        }
        return paintingArea;
    }
}
