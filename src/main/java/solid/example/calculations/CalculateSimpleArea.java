package solid.example.calculations;

import solid.example.models.*;
import solid.example.user.interactions.UserInteraction;


public class CalculateSimpleArea implements CalculateArea {

    private static UserInteraction userInteraction = new UserInteraction();

    @Override
    public Double calculateArea(Figure figure) {

        Double area = null;

        if (figure instanceof Square) {

            Square square = userInteraction.createSquareWithUserInput();
            area = square.getArea();

        } else if (figure instanceof Circle) {

            Circle circle = userInteraction.createCircleWithUserInput();
            area = circle.getArea();

        } else if (figure instanceof Triangle) {

            Triangle triangle = userInteraction.createTriangleWithUserInput();
            area = triangle.getArea();

        } else if (figure instanceof Rectangle) {

            Rectangle rectangle = userInteraction.createRectangleWithUserInput();
            area = rectangle.getArea();
        }
        return area;
    }
}
