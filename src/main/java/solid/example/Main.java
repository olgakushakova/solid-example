package solid.example;

import solid.example.models.Figure;


public class Main {

    private static UserInteraction userInteraction = new UserInteraction();
    private static CalculateArea calculateArea = new CalculateArea();

    public static void main(String[] args) {

        Figure figure = userInteraction.readFigureFromInput();

        String areaType = userInteraction.readAreaTypeFromInput(figure);

        Double area = calculateArea.calculateArea(figure, areaType);

        userInteraction.printAreaInConsole(figure, areaType, area);
    }
}