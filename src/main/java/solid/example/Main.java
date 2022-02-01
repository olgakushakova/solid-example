package solid.example;

import solid.example.controllers.*;
import solid.example.models.Figure;


public class Main {

    private static UserInteractionController userInteractionController = new UserInteractionController();
    private static CalculateArea calculateArea = new CalculateArea();

    public static void main(String[] args) {

        Figure figure = userInteractionController.readFigureFromInput();

        Double area = calculateArea.calculateArea(figure);

        userInteractionController.printAreaOnTheScreen(figure, area);
    }
}