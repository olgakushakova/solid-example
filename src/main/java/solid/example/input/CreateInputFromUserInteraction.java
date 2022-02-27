package solid.example.input;

import solid.example.models.*;


public class CreateInputFromUserInteraction implements CreateInput {


    @Override
    public Figure getInputFigure() {

        InputFigureFromUserInput inputFigure = new InputFigureFromUserInput();
        return inputFigure.createFigure();
    }

    @Override
    public String getInputAreaType() {

        AreaTypeFromUserInput areaType = new AreaTypeFromUserInput();
        return areaType.defineAreaType();
    }
}