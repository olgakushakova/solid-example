package solid.example;

import solid.example.calculations.CalculateArea;
import solid.example.calculations.CalculatePaintingArea;
import solid.example.calculations.CalculateSimpleArea;
import solid.example.calculations.CalculateTileArea;
import solid.example.input.CreateInput;
import solid.example.models.Figure;
import solid.example.output.StringConsoleAndCsvFileOutput;
import solid.example.input.CreateInputFromUserInteraction;

import java.util.List;


public class Main {

    private static CreateInput userInteractionInput = new CreateInputFromUserInteraction();
    private static CalculateArea calculateArea;
    private static StringConsoleAndCsvFileOutput processResult = new StringConsoleAndCsvFileOutput();

    public static void main(String[] args) {

        // Define input parameters - create figure and set properties for the figure from user input
        Figure figure = userInteractionInput.getInputFigure();

        String areaType = userInteractionInput.getInputAreaType();

        // Calculate area of the figure - check area type and calculate area in accordance
        if (areaType == "simple") {
            calculateArea = new CalculateSimpleArea();
        } else if (areaType == "painting") {
            calculateArea = new CalculatePaintingArea();
        } else if (areaType == "tile") {
            calculateArea = new CalculateTileArea();
        }
        Double area = calculateArea.calculateArea(figure);

        // Process results of calculations - write to file and to console
        List<String[]> list = processResult.prepareDataAsList(figure, areaType, area);
        processResult.writePreparedListDataToOutput(list);
        processResult.writePlainDataToConsole(figure, areaType, area);
    }
}