package solid.example.models;

import lombok.Data;

import java.util.Scanner;

@Data
public class Circle extends Figure {

    private Double radius;

    public Double getArea() {

        return Math.PI * radius * radius;
    }

    public Circle createFigureFromUserInput() {

        Scanner inputObj = new Scanner(System.in);

        Circle circle = new Circle();

        System.out.println("Enter radius of the circle: ");
        Double radius = inputObj.nextDouble();

        circle.setRadius(radius);

        return circle;
    }
}
