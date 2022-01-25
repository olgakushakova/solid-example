package solid.example;

import solid.example.controllers.*;
import solid.example.models.Figure;


public class Main {

    private static FigureInputController figureInputController = new FigureInputController();
    private static CalculateArea calculateArea = new CalculateArea();

    public static void main(String[] args) {

        Figure figure = figureInputController.readFigureFromInput();

        Double area = calculateArea.calculateArea(figure);

        System.out.println("The area of the " + figure + " is equal to " + area);

    }
}