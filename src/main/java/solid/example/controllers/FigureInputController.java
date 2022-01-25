package solid.example.controllers;

import solid.example.models.Figure;

import java.util.Scanner;

public class FigureInputController {

    public Figure readFigureFromInput() {

        Figure figure = null;

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter figure type from the list. Enter the number and press Enter: \n 1 - Square \n 2 - Circle \n 3 - Triangle");

        Integer figureNumber = Integer.parseInt(myObj.nextLine());  // Read user input
        if (figureNumber == 1) {
            figure = Figure.SQUARE;
        } if (figureNumber == 2) {
            figure = Figure.CIRCLE;
        } if (figureNumber == 3) {
            figure = Figure.TRIANGLE;
        }
        System.out.println("Let's calculate the area of a " + figure);  // Output user input

        return figure;
    }
}