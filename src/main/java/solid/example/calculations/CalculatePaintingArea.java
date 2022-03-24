package solid.example.calculations;

import solid.example.models.*;
import solid.example.input.UserInteraction;

public class CalculatePaintingArea implements CalculateArea {

    private static final Double PAINTING_COEFFICIENT = 1.1;

    private static UserInteraction userInteraction = new UserInteraction();


    @Override
    public Double calculateArea(Figure figure) {

        Double area = null;

        if (figure instanceof Square) {

            Square square = userInteraction.createSquareWithUserInput();
            area = square.getArea() * PAINTING_COEFFICIENT;

        } else if (figure instanceof Circle) {

            Circle circle = userInteraction.createCircleWithUserInput();
            area = circle.getArea() * PAINTING_COEFFICIENT;

        } else if (figure instanceof Triangle) {

            Triangle triangle = userInteraction.createTriangleWithUserInput();
            area = triangle.getArea() * PAINTING_COEFFICIENT;

        } else if (figure instanceof Rectangle) {

            Rectangle rectangle = userInteraction.createRectangleWithUserInput();
            area = rectangle.getArea() * PAINTING_COEFFICIENT;
        }
        return area;
    }
}
