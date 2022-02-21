package solid.example.input;

import solid.example.models.*;

import java.util.Scanner;

public class CreateInputFromUserInteraction implements CreateInput {

    Scanner figureInputObject = new Scanner(System.in);

    @Override
    public Figure getInputFigure() {

        Figure figure = null;

        System.out.println("Enter figure type from the list. Enter the number and press Enter: " +
                "\n 1 - Square \n 2 - Circle \n 3 - Triangle \n 4 - Rectangle");

        Integer figureNumber = Integer.parseInt(figureInputObject.nextLine());
        if (figureNumber == 1) {
            figure = createSquareWithUserInput();
        }
        else if (figureNumber == 2) {
            figure = createCircleWithUserInput();
        }
        else if (figureNumber == 3) {
            figure = createTriangleWithUserInput();
        }
        else if (figureNumber == 4) {
            figure = createRectangleWithUserInput();
        }
        return figure;
    }

    @Override
    public String getInputAreaType() {

        Scanner areaTypeInputObject = new Scanner(System.in);


        String areaType = null;

        System.out.println("What kind of calculations do you need: " +
                "\n 1 - Simple \n 2 - Painting \n 3 - Tile");

        Integer areaTypeNumber = Integer.parseInt(areaTypeInputObject.nextLine());
        if (areaTypeNumber == 1) {
            areaType = "simple";
        }
        else if (areaTypeNumber == 2) {
            areaType = "painting";
        }
        else if (areaTypeNumber == 3) {
            areaType = "tile";
        }
        System.out.println("Let's calculate " + areaType + " area of a selected figure");

        return areaType;
    }

    public Square createSquareWithUserInput() {

        Square square = new Square();

        System.out.println("Enter length of the square side: ");
        Double length = figureInputObject.nextDouble();

        square.setSideLength(length);

        return square;
    }

    public Circle createCircleWithUserInput() {

        Circle circle = new Circle();

        System.out.println("Enter radius of the circle: ");
        Double radius = figureInputObject.nextDouble();

        circle.setRadius(radius);

        return circle;
    }

    public Triangle createTriangleWithUserInput() {

        Triangle triangle = new Triangle();

        System.out.println("Enter the length of the one triangle side: ");
        Double firstSideLength = figureInputObject.nextDouble();
        System.out.println("Enter the length of the other triangle side: ");
        Double secondSideLength = figureInputObject.nextDouble();
        System.out.println("Enter the included angle: ");
        Double angle = figureInputObject.nextDouble();

        triangle.setFirstSideLength(firstSideLength);
        triangle.setSecondSideLength(secondSideLength);
        triangle.setFirstAndSecondSidesAngle(angle);

        return triangle;
    }

    public Rectangle createRectangleWithUserInput() {

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the rectangle width: ");
        Double width = figureInputObject.nextDouble();
        System.out.println("Enter the rectangle height: ");
        Double height = figureInputObject.nextDouble();

        rectangle.setWidth(width);
        rectangle.setHeight(height);

        return rectangle;
    }
}