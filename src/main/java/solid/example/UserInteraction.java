package solid.example;

import solid.example.models.Figure;

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
                "\n 1 - Simple \n 2 - Decoration");

        Integer areaTypeNumber = Integer.parseInt(myObj.nextLine());
        if (areaTypeNumber == 1) areaType = "simple";
        else if (areaTypeNumber == 2) areaType = "decoration";
        System.out.println("Let's calculate " + areaType + " area of a " + figure);  // Output user input

        return areaType;
    }

    public void printAreaInConsole(Figure figure, String areaType, Double area) {

        System.out.println("The " + areaType + " area of the " + figure + " is " + area);
    }
}