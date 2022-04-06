package solid.example.output;

import solid.example.models.Figure;

import java.util.List;
import java.util.Map;

public interface DbOutput {

    Map<String, Object> prepareDataAsMap(Figure figure, String areaType, Double area);

    void writePreparedMapDataToDb(List<String[]> preparedListData);
}
