package solid.example.calculations;

import solid.example.user.interactions.UserInteraction;
import solid.example.models.Circle;
import solid.example.models.Figure;
import solid.example.models.Square;
import solid.example.models.Triangle;

public class CalculateTileArea implements CalculateArea {

    private static final Double CIRCLE_AND_TRIANGLE_COEFFICIENT_TILE = 1.2;
    private static final Double SQUARE_COEFFICIENT_TILE = 1.1;

    private static UserInteraction userInteraction = new UserInteraction();

    @Override
    public Double calculateArea(Figure figure) {

        Double area = null;

        if (figure instanceof Square) {

            Square square = userInteraction.createSquareWithUserInput();
            area = square.getArea() * SQUARE_COEFFICIENT_TILE;

        } else if (figure instanceof Circle) {

            Circle circle = userInteraction.createCircleWithUserInput();
            area = circle.getArea() * CIRCLE_AND_TRIANGLE_COEFFICIENT_TILE;

        } else if (figure instanceof Triangle) {

            Triangle triangle = userInteraction.createTriangleWithUserInput();
            area = triangle.getArea()
                    * CIRCLE_AND_TRIANGLE_COEFFICIENT_TILE;
        }
        return area;
    }
}
