package solid.example.output;

import solid.example.models.Figure;

import java.util.List;
import java.util.Map;

public interface DbOutput {

    void createConnection();

    Map<String, Object> prepareDataAsMap(Figure figure, String areaType, Double area);

    void writePreparedListDataToOutput(List<String[]> preparedListData);
}
