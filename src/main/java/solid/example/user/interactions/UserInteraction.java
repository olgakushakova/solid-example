package solid.example.user.interactions;

import solid.example.models.Circle;
import solid.example.models.Figure;
import solid.example.models.Square;
import solid.example.models.Triangle;

import java.util.Scanner;

public class UserInteraction {

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    public Figure readFigureFromInput() {

        Figure figure = null;

        System.out.println("Enter figure type from the list. Enter the number and press Enter: " +
                "\n 1 - Square \n 2 - Circle \n 3 - Triangle");

        Integer figureNumber = Integer.parseInt(myObj.nextLine());  // Read user input
        if (figureNumber == 1) {
            figure = Figure.SQUARE;
        }
        if (figureNumber == 2) {
            figure = Figure.CIRCLE;
        }
        if (figureNumber == 3) {
            figure = Figure.TRIANGLE;
        }
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
        System.out.println("Let's calculate " + areaType + " area of a " + figure);  // Output user input

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

        System.out.println("Enter the length of the triangle base: ");
        Double length = myObj.nextDouble();
        System.out.println("Enter the length of the triangle height: ");
        Double height = myObj.nextDouble();

        triangle.setBaseLength(length);
        triangle.setHeight(height);

        return triangle;
    }

    public void printAreaInConsole(Figure figure, String areaType, Double area) {

        System.out.println("The " + areaType + " area of the " + figure + " is " + area);
    }
}