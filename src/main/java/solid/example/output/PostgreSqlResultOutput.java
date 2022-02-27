package solid.example.output;

import solid.example.models.Figure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PostgreSqlResultOutput implements DbOutput {

    @Override
    public void createConnection() {

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
        // Some implementation
    }
}
