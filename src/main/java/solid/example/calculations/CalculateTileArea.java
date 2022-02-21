package solid.example.calculations;

import solid.example.models.*;


public class CalculateTileArea extends CalculateSimpleArea {

    private static final Double TILE_COEFFICIENT = 1.4;

    @Override
    public Double calculateArea(Figure figure) {

        return figure.getArea() * TILE_COEFFICIENT;
    }
}
