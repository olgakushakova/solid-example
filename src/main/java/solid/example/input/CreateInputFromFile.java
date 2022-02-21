package solid.example.input;

import solid.example.models.Figure;

public class CreateInputFromFile implements CreateInput {

    @Override
    public Figure getInputFigure() {
        // Logic to read figure name and properties from file
        return null;
    }

    @Override
    public String getInputAreaType() {
        // Logic to read area type to make calculations from file
        return null;
    }
}
