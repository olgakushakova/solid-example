package solid.example.calculations;

import solid.example.user.interactions.UserInteraction;
import solid.example.models.Circle;
import solid.example.models.Figure;
import solid.example.models.Square;
import solid.example.models.Triangle;

public class CalculatePaintingArea extends CalculateArea {

    private static final Double CIRCLE_AND_TRIANGLE_COEFFICIENT_PAINTING = 1.1;
    private static final Double SQUARE_COEFFICIENT_PAINTING = 1.05;

    private static UserInteraction userInteraction = new UserInteraction();

    public Double calculatePaintingArea(Figure figure) {

        Double paintingArea = null;

        if (figure == Figure.CIRCLE) {
            Circle circle = userInteraction.createCircleWithUserInput();
            paintingArea = super.calculateCircleArea(circle) * CIRCLE_AND_TRIANGLE_COEFFICIENT_PAINTING;
        } else if (figure == Figure.SQUARE) {
            Square square = userInteraction.createSquareWithUserInput();
            paintingArea = super.calculateSquareArea(square) * SQUARE_COEFFICIENT_PAINTING;
        } else if (figure == Figure.TRIANGLE) {
            Triangle triangle = userInteraction.createTriangleWithUserInput();
            paintingArea = super.calculateTriangleArea(triangle) * CIRCLE_AND_TRIANGLE_COEFFICIENT_PAINTING;
        }
        return paintingArea;
    }
}
