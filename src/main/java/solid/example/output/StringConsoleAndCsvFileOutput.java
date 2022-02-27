package solid.example.output;

import solid.example.models.Figure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringConsoleAndCsvFileOutput implements ConsoleOutput, FileOutput {

    private List<String[]> dataLines = new ArrayList<>();

    @Override
    public void writePlainDataToConsole(Figure figure, String areaType, Double area) {

        System.out.println("The " + areaType + " area of the " + figure.getClass().getSimpleName() +
                " is " + BigDecimal.valueOf(area).setScale(3, RoundingMode.HALF_UP));
    }

    @Override
    public List<String[]> prepareDataAsList(Figure figure, String areaType, Double area) {
        dataLines.add(new String[] {"Figure", "Type of area", "Area"});
        dataLines.add(new String[]{figure.getClass().getSimpleName(), areaType, area.toString()});

        return dataLines;
    }

    @Override
    public void writePreparedListDataToOutput(List<String[]> preparedListData) {
        File csvOutputFile = new File("C:\\Users\\o_kus\\Documents\\solid-example\\new_file-"
                + Arrays.stream(preparedListData.get(1)).findFirst().get() + new Random().nextInt() + ".csv");

        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            dataLines.stream()
                    .map(this::convertLineToCSV)
                    .forEach(pw::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    String convertLineToCSV(String[] dataLines) {
        return Stream.of(dataLines)
                .collect(Collectors.joining(","));
    }
}
