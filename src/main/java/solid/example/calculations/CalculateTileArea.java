package solid.example.calculations;

import solid.example.models.*;


public class CalculateTileArea implements CalculateArea {

    private static final Double TILE_COEFFICIENT = 1.2;

    @Override
    public Double calculateArea(Figure figure) {

        return figure.getArea() * TILE_COEFFICIENT;
    }
}
