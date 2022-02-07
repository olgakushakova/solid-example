package solid.example.calculations;

import solid.example.user.interactions.UserInteraction;
import solid.example.models.Circle;
import solid.example.models.Figure;
import solid.example.models.Square;
import solid.example.models.Triangle;

public class CalculatePaintingArea {

    private static final Double CIRCLE_AND_TRIANGLE_COEFFICIENT_PAINTING = 1.1;
    private static final Double SQUARE_COEFFICIENT_PAINTING = 1.05;

    private static UserInteraction userInteraction = new UserInteraction();

    public Double calculatePaintingArea(Figure figure) {

        Double paintingArea = null;

        if (figure == Figure.CIRCLE) {
            Circle circle = userInteraction.createCircleWithUserInput();
            paintingArea = calculateCirclePaintingArea(circle);
        } else if (figure == Figure.SQUARE) {
            Square square = userInteraction.createSquareWithUserInput();
            paintingArea = calculateSquarePaintingArea(square);
        } else if (figure == Figure.TRIANGLE) {
            Triangle triangle = userInteraction.createTriangleWithUserInput();
            paintingArea = calculateTrianglePaintingArea(triangle);
        }
        return paintingArea;
    }


    public double calculateSquarePaintingArea(Square square) {

        return square.getSideLength() * square.getSideLength() * SQUARE_COEFFICIENT_PAINTING;
    }

    public double calculateCirclePaintingArea(Circle circle) {

        return Math.PI * circle.getRadius() * circle.getRadius() * CIRCLE_AND_TRIANGLE_COEFFICIENT_PAINTING;
    }

    public double calculateTrianglePaintingArea(Triangle triangle) {

        return triangle.getBaseLength() * triangle.getHeight() / 2 * CIRCLE_AND_TRIANGLE_COEFFICIENT_PAINTING;
    }
}
