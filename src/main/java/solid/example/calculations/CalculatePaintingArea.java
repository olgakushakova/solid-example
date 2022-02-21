package solid.example.calculations;

import solid.example.models.*;


public class CalculatePaintingArea extends CalculateSimpleArea {

    private static final Double PAINTING_COEFFICIENT = 1.2;

    public Double calculateArea(Figure figure) {

        return figure.getArea() * PAINTING_COEFFICIENT;
    }
}
