package solid.example;

import solid.example.calculations.CalculateArea;
import solid.example.calculations.CalculatePaintingArea;
import solid.example.calculations.CalculateSimpleArea;
import solid.example.calculations.CalculateTileArea;
import solid.example.models.Figure;
import solid.example.user.interactions.UserInteraction;


public class Main {

    private static UserInteraction userInteraction = new UserInteraction();
    private static CalculateArea calculateArea;

    public static void main(String[] args) {

        Figure figure = userInteraction.readFigureFromInput();

        String areaType = userInteraction.readAreaTypeFromInput(figure);

        if (areaType == "simple") {
            calculateArea = new CalculateSimpleArea();
        } else if (areaType == "painting") {
            calculateArea = new CalculatePaintingArea();
        } else if (areaType == "tile") {
            calculateArea = new CalculateTileArea();
        }

        Double area = calculateArea.calculateArea(figure);

        userInteraction.printAreaInConsole(figure, areaType, area);
    }
}