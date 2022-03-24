package solid.example.calculations;

import solid.example.models.*;


public class CalculatePaintingArea implements CalculateArea {

    private static final Double PAINTING_COEFFICIENT = 1.1;

    @Override
    public Double calculateArea(Figure figure) {

        return figure.getArea() * PAINTING_COEFFICIENT;
    }
}
