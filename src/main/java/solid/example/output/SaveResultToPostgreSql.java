package solid.example.output;

import solid.example.models.Figure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SaveResultToPostgreSql implements ProcessResult {

    @Override
    public List<String[]> prepareDataAsList(Figure figure, String areaType, Double area) {
        // Not needed here
        return null;
    }

    @Override
    public Map<String, Object> prepareDataAsMap(Figure figure, String areaType, Double area) {

        Map<String, Object> map = new HashMap<>();

        String figureFieldHeader = "FIGURE";
        String areaTypeFieldHeader = "AREA_TYPE";
        String areaFieldHeader = "AREA";

        map.put(figureFieldHeader, figure.getClass().getSimpleName());
        map.put(areaTypeFieldHeader, areaType);
        map.put(areaFieldHeader, Math.round(area));

        return map;
    }

    @Override
    public void writePreparedListDataToOutput(List<String[]> preparedListData) {
        // Not needed here
    }

    @Override
    public void writePreparedMapDataToOutput(Map<String, Object> preparedMapData) {
        // Create connection to PostgreSql -> Create table if not exists -> Insert results from map
    }

    @Override
    public void writePlainDataToOutput(Figure figure, String areaType, Double area) {
        // Not needed here
    }
}
