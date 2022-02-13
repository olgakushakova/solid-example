package solid.example.output;

import solid.example.models.Figure;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessResult {

    public void printAreaInConsole(Figure figure, String areaType, Double area) {

        System.out.println("The " + areaType + " area of the " + figure.getClass().getSimpleName() + " is " + area);
    }

    public void saveDataToFile(Figure figure, String areaType, Double area) throws IOException {

        // Preparing the data
        List<String[]> dataLines = new ArrayList<>();
        dataLines.add(new String[] {"Figure", "Type of area", "Area"});
        dataLines.add(new String[]{figure.getClass().getSimpleName(), areaType, area.toString()});

        // Creating a file
        File csvOutputFile = new File("C:\\Users\\o_kus\\Documents\\solid-example\\new_file-"
                + figure.getClass().getSimpleName() + new Random().nextInt() + ".csv");

        // Writing to the file
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            dataLines.stream()
                    .map(this::convertLineToCSV)
                    .forEach(pw::println);
        }
    }

    public void saveDataToDb(Figure figure, String areaType, Double area) {

        // Implementation:
        // Step 1 - Preparing the data
        // Step 2 - Writing to the DB
    }

    String convertLineToCSV(String[] data) {
        return Stream.of(data)
                .collect(Collectors.joining(","));
    }
}
