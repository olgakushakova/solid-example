package solid.example.calculations;

import solid.example.models.Figure;


public class CalculateSimpleArea implements CalculateArea {

    @Override
    public Double calculateArea(Figure figure) {
        return figure.getArea();
    }
}
