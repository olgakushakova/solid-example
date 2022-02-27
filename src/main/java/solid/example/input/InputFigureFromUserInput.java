package solid.example.input;

import solid.example.models.*;

import java.util.Scanner;

public class InputFigureFromUserInput {

    Figure figure = null;

    Scanner inputObj = new Scanner(System.in);

    public Figure createFigure() {

        System.out.println("Enter figure type from the list. Enter the number and press Enter: " +
                "\n 1 - Square \n 2 - Circle \n 3 - Triangle \n 4 - Rectangle");

        Integer figureNumber = Integer.parseInt(inputObj.nextLine());

        if (figureNumber == 1) {
            figure = createSquareFromUserInput();
        } else if (figureNumber == 2) {
            figure = createCircleFromUserInput();
        } else if (figureNumber == 3) {
            figure = createTriangleFromUserInput();
        } else if (figureNumber == 4) {
            figure = createRectangleFromUserInput();
        }
        return figure;
    }

    private Square createSquareFromUserInput() {

        Scanner inputObj = new Scanner(System.in);

        Square square = new Square();

        System.out.println("Enter length of the square side: ");
        Double length = inputObj.nextDouble();

        square.setSideLength(length);

        return square;
    }

    private Circle createCircleFromUserInput() {

        Scanner inputObj = new Scanner(System.in);

        Circle circle = new Circle();

        System.out.println("Enter radius of the circle: ");
        Double radius = inputObj.nextDouble();

        circle.setRadius(radius);

        return circle;
    }

    private Triangle createTriangleFromUserInput() {

        Scanner inputObj = new Scanner(System.in);

        Triangle triangle = new Triangle();

        System.out.println("Enter the length of the one triangle side: ");
        Double firstSideLength = inputObj.nextDouble();
        System.out.println("Enter the length of the other triangle side: ");
        Double secondSideLength = inputObj.nextDouble();
        System.out.println("Enter the included angle: ");
        Double angle = inputObj.nextDouble();

        triangle.setFirstSideLength(firstSideLength);
        triangle.setSecondSideLength(secondSideLength);
        triangle.setFirstAndSecondSidesAngle(angle);

        return triangle;
    }

    private Rectangle createRectangleFromUserInput() {

        Scanner inputObj = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the rectangle width: ");
        Double width = inputObj.nextDouble();
        System.out.println("Enter the rectangle height: ");
        Double height = inputObj.nextDouble();

        rectangle.setWidth(width);
        rectangle.setHeight(height);

        return rectangle;
    }
}
