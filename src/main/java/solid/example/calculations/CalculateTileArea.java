package solid.example.calculations;

import solid.example.models.*;
import solid.example.user.interactions.UserInteraction;

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

        } else if (figure instanceof Rectangle) {

            Rectangle rectangle = userInteraction.createRectangleWithUserInput();
            area = rectangle.getArea() * TILE_COEFFICIENT;
        }
        return area;
    }
}
