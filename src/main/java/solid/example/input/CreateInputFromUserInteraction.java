package solid.example.input;

import solid.example.models.*;


public class CreateInputFromUserInteraction implements CreateInput {


    @Override
    public Figure getInputFigure() {

        InputFigure inputFigure = new InputFigure();
        return inputFigure.createFigure();

    }

    @Override
    public String getInputAreaType() {

        AreaType areaType = new AreaType();
        return areaType.defineAreaType();
    }
}