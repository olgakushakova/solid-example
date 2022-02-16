package solid.example.output;

import solid.example.models.Figure;

import java.util.List;
import java.util.Map;

public interface ProcessResult {

    List<String[]> prepareDataAsList(Figure figure, String areaType, Double area);

    Map<String, Object> prepareDataAsMap(Figure figure, String areaType, Double area);

    void writePreparedListDataToOutput(List<String[]> preparedListData);

    void writePreparedMapDataToOutput(Map<String, Object> preparedMapData);

    void writePlainDataToOutput(Figure figure, String areaType, Double area);
}
