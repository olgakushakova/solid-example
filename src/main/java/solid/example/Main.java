package solid.example;

import solid.example.calculations.CalculatePaintingArea;
import solid.example.calculations.CalculateSimpleArea;
import solid.example.calculations.CalculateTileArea;
import solid.example.input.CreateInput;
import solid.example.models.Figure;
import solid.example.output.StringConsoleAndCsvFileOutput;
import solid.example.input.CreateInputFromUserInteraction;

import java.util.List;


public class Main {

    private static StringConsoleAndCsvFileOutput processResult = new StringConsoleAndCsvFileOutput();
    private static Figure figure;
    private static String areaType;
    private static Double area;

    public static void main(String[] args) {

        // Define input parameters - create figure and set properties for the figure from user input
        CreateInput userInteractionInput = new CreateInputFromUserInteraction();
        figure = userInteractionInput.getInputFigure();
        areaType = userInteractionInput.getInputAreaType();

        // Calculate area of the figure - check area type and calculate area in accordance
        if (areaType == "simple") {
            CalculateSimpleArea calculateSimpleArea = new CalculateSimpleArea();
            area = calculateSimpleArea.calculateArea(figure);
        } else if (areaType == "painting") {
            CalculatePaintingArea calculatePaintingArea = new CalculatePaintingArea();
            area = calculatePaintingArea.calculateArea(figure);
        } else if (areaType == "tile") {
            CalculateTileArea calculateTileArea = new CalculateTileArea();
            area = calculateTileArea.calculateArea(figure);
        }

        // Process results of calculations - write to file and to console
        List<String[]> list = processResult.prepareDataAsList(figure, areaType, area);
        processResult.writePreparedListDataToOutput(list);
        processResult.writePlainDataToConsole(figure, areaType, area);
    }
}