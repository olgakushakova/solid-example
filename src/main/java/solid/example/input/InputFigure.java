package solid.example.input;

import solid.example.models.*;

import java.util.Scanner;

public class InputFigure {

    Figure figure = null;

    Scanner inputObj = new Scanner(System.in);

    public Figure createFigure() {

        System.out.println("Enter figure type from the list. Enter the number and press Enter: " +
                "\n 1 - Square \n 2 - Circle \n 3 - Triangle \n 4 - Rectangle");

        Integer figureNumber = Integer.parseInt(inputObj.nextLine());

        if (figureNumber == 1) {
            Square square = new Square();
            figure = square.createFigureFromUserInput();
        } else if (figureNumber == 2) {
            Circle circle = new Circle();
            figure = circle.createFigureFromUserInput();
        } else if (figureNumber == 3) {
            Triangle triangle = new Triangle();
            figure = triangle.createFigureFromUserInput();
        } else if (figureNumber == 4) {
            Rectangle rectangle = new Rectangle();
            figure = rectangle.createFigureFromUserInput();
        }

        return figure;
    }
}
