package solid.example.output;

import solid.example.models.Figure;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;

public class SendResultToConsole implements ProcessResult {

    @Override
    public List<String[]> prepareDataAsList(Figure figure, String areaType, Double area) {
        // Not needed here
        return null;
    }

    @Override
    public Map<String, Object> prepareDataAsMap(Figure figure, String areaType, Double area) {
        // Not needed here
        return null;
    }

    @Override
    public void writePreparedListDataToOutput(List<String[]> preparedListData) {
        // Not needed here
    }

    @Override
    public void writePreparedMapDataToOutput(Map<String, Object> preparedMapData) {
        // Not needed here
    }

    @Override
    public void writePlainDataToOutput(Figure figure, String areaType, Double area) {

        System.out.println("The " + areaType + " area of the " + figure.getClass().getSimpleName() +
                " is " + BigDecimal.valueOf(area).setScale(3, RoundingMode.HALF_UP));
    }
}


