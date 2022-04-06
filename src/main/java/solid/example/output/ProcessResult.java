package solid.example.output;

import solid.example.models.Figure;

import java.util.List;
import java.util.Map;

public interface ProcessResult {

    List<String[]> prepareDataAsList(Figure figure, String areaType, Double area);

    Map<String, Object> prepareDataAsMap(Figure figure, String areaType, Double area);

    void writePreparedListDataToFile(List<String[]> preparedListData);

    void writePreparedMapDataToDb(Map<String, Object> preparedMapData);

    void writePlainDataToConsole(Figure figure, String areaType, Double area);
}
