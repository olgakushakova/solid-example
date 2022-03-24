package solid.example.models;

import lombok.Data;


@Data
public class Triangle implements Figure {

    private Double firstSideLength;
    private Double secondSideLength;
    private Double firstAndSecondSidesAngle;

    public Double getArea() {

        return firstSideLength * secondSideLength / 2
                * Math.sin(Math.toRadians(firstAndSecondSidesAngle));
    }
}
