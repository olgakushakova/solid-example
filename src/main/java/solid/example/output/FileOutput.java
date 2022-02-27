package solid.example.output;

import solid.example.models.Figure;

import java.util.List;

public interface FileOutput {

    List<String[]> prepareDataAsList(Figure figure, String areaType, Double area);

    void writePreparedListDataToOutput(List<String[]> preparedListData);
}
