package solid.example.output;

import solid.example.models.Figure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SaveResultToCsvFile implements ProcessResult {

    private List<String[]> dataLines = new ArrayList<>();


    @Override
    public List<String[]> prepareDataAsList(Figure figure, String areaType, Double area) {
        dataLines.add(new String[] {"Figure", "Type of area", "Area"});
        dataLines.add(new String[]{figure.getClass().getSimpleName(), areaType, area.toString()});

        return dataLines;
    }

    @Override
    public Map<String, Object> prepareDataAsMap(Figure figure, String areaType, Double area) {
        // Not needed here
        return null;
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

    @Override
    public void writePreparedMapDataToOutput(Map<String, Object> preparedMapData) {
        // Not needed here
    }

    @Override
    public void writePlainDataToOutput(Figure figure, String areaType, Double area) {
        // Not needed here
    }

    String convertLineToCSV(String[] dataLines) {
        return Stream.of(dataLines)
                .collect(Collectors.joining(","));
    }
}
