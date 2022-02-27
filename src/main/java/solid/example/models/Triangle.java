package solid.example.models;

import lombok.Data;

import java.util.Scanner;

@Data
public class Triangle extends Figure {

    private Double firstSideLength;
    private Double secondSideLength;
    private Double firstAndSecondSidesAngle;

    public Double getArea() {

        return firstSideLength * secondSideLength / 2
                * Math.sin(Math.toRadians(firstAndSecondSidesAngle));
    }

    @Override
    public Triangle createFigureFromUserInput() {

        Scanner inputObj = new Scanner(System.in);

        Triangle triangle = new Triangle();

        System.out.println("Enter the length of the one triangle side: ");
        Double firstSideLength = inputObj.nextDouble();
        System.out.println("Enter the length of the other triangle side: ");
        Double secondSideLength = inputObj.nextDouble();
        System.out.println("Enter the included angle: ");
        Double angle = inputObj.nextDouble();

        triangle.setFirstSideLength(firstSideLength);
        triangle.setSecondSideLength(secondSideLength);
        triangle.setFirstAndSecondSidesAngle(angle);

        return triangle;
    }
}
