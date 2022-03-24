package solid.example.calculations;

import solid.example.user.interactions.UserInteraction;
import solid.example.models.Circle;
import solid.example.models.Figure;
import solid.example.models.Square;
import solid.example.models.Triangle;

public class CalculateTileArea implements CalculateArea {

    private static final Double TILE_COEFFICIENT = 1.2;

    private static UserInteraction userInteraction = new UserInteraction();

    @Override
    public Double calculateArea(Figure figure) {

        Double area = null;

        if (figure instanceof Square) {

            Square square = userInteraction.createSquareWithUserInput();
            area = square.getArea() * TILE_COEFFICIENT;

        } else if (figure instanceof Circle) {

            Circle circle = userInteraction.createCircleWithUserInput();
            area = circle.getArea() * TILE_COEFFICIENT;

        } else if (figure instanceof Triangle) {

            Triangle triangle = userInteraction.createTriangleWithUserInput();
            area = triangle.getArea() * TILE_COEFFICIENT;
        }
        return area;
    }
}
