package solid.example.calculations;

import solid.example.user.interactions.UserInteraction;
import solid.example.models.Circle;
import solid.example.models.Figure;
import solid.example.models.Square;
import solid.example.models.Triangle;

public class CalculatePaintingArea implements CalculateArea {

    private static final Double CIRCLE_AND_TRIANGLE_COEFFICIENT_PAINTING = 1.1;
    private static final Double SQUARE_COEFFICIENT_PAINTING = 1.05;

    private static UserInteraction userInteraction = new UserInteraction();


    @Override
    public Double calculateArea(Figure figure) {

        Double area = null;

        if (figure instanceof Square) {

            Square square = userInteraction.createSquareWithUserInput();
            area = square.getArea() * SQUARE_COEFFICIENT_PAINTING;

        } else if (figure instanceof Circle) {

            Circle circle = userInteraction.createCircleWithUserInput();
            area = circle.getArea() * CIRCLE_AND_TRIANGLE_COEFFICIENT_PAINTING;

        } else if (figure instanceof Triangle) {

            Triangle triangle = userInteraction.createTriangleWithUserInput();
            area = triangle.getArea()
                    * CIRCLE_AND_TRIANGLE_COEFFICIENT_PAINTING;
        }
        return area;
    }
}
