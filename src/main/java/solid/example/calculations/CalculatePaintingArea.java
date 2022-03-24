package solid.example.calculations;

import solid.example.user.interactions.UserInteraction;
import solid.example.models.Circle;
import solid.example.models.Figure;
import solid.example.models.Square;
import solid.example.models.Triangle;

public class CalculatePaintingArea extends CalculateArea {

    private static final Double PAINTING_COEFFICIENT = 1.1;

    private static UserInteraction userInteraction = new UserInteraction();

    public Double calculatePaintingArea(Figure figure) {

        Double paintingArea = null;

        if (figure == Figure.CIRCLE) {
            Circle circle = userInteraction.createCircleWithUserInput();
            paintingArea = calculateCircleArea(circle) * PAINTING_COEFFICIENT;
        } else if (figure == Figure.SQUARE) {
            Square square = userInteraction.createSquareWithUserInput();
            paintingArea = calculateSquareArea(square) * PAINTING_COEFFICIENT;
        } else if (figure == Figure.TRIANGLE) {
            Triangle triangle = userInteraction.createTriangleWithUserInput();
            paintingArea = calculateTriangleArea(triangle) * PAINTING_COEFFICIENT;
        }
        return paintingArea;
    }
}
