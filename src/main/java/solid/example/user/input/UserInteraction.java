package solid.example.user.input;

import solid.example.models.*;

import java.util.Scanner;

public class UserInteraction {

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    public Figure readFigureFromInput() {

        Figure figure = null;

        System.out.println("Enter figure type from the list. Enter the number and press Enter: " +
                "\n 1 - Square \n 2 - Circle \n 3 - Triangle \n 4 - Rectangle");

        Integer figureNumber = Integer.parseInt(myObj.nextLine());  // Read user input
        if (figureNumber == 1) figure = new Square();
        else if (figureNumber == 2) figure = new Circle();
        else if (figureNumber == 3) figure = new Triangle();
        else if (figureNumber == 4) figure = new Rectangle();
        return figure;
    }

    public String readAreaTypeFromInput(Figure figure) {
        String areaType = null;

        System.out.println("What kind of calculations do you need: " +
                "\n 1 - Simple \n 2 - Painting \n 3 - Tile");

        Integer areaTypeNumber = Integer.parseInt(myObj.nextLine());
        if (areaTypeNumber == 1) areaType = "simple";
        else if (areaTypeNumber == 2) areaType = "painting";
        else if (areaTypeNumber == 3) areaType = "tile";
        System.out.println("Let's calculate " + areaType + " area of a " + figure.getClass().getSimpleName());  // Output user input

        return areaType;
    }

    public Square createSquareWithUserInput() {

        Square square = new Square();

        System.out.println("Enter length of the square side: ");
        Double length = myObj.nextDouble();

        square.setSideLength(length);

        return square;
    }

    public Circle createCircleWithUserInput() {

        Circle circle = new Circle();

        System.out.println("Enter radius of the circle: ");
        Double radius = myObj.nextDouble();

        circle.setRadius(radius);

        return circle;
    }

    public Triangle createTriangleWithUserInput() {

        Triangle triangle = new Triangle();

        System.out.println("Enter the length of the one triangle side: ");
        Double firstSideLength = myObj.nextDouble();
        System.out.println("Enter the length of the other triangle side: ");
        Double secondSideLength = myObj.nextDouble();
        System.out.println("Enter the included angle: ");
        Double angle = myObj.nextDouble();

        triangle.setFirstSideLength(firstSideLength);
        triangle.setSecondSideLength(secondSideLength);
        triangle.setFirstAndSecondSidesAngle(angle);

        return triangle;
    }

    public Rectangle createRectangleWithUserInput() {

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the rectangle width: ");
        Double width = myObj.nextDouble();
        System.out.println("Enter the rectangle height: ");
        Double height = myObj.nextDouble();

        rectangle.setWidth(width);
        rectangle.setHeight(height);

        return rectangle;
    }

}