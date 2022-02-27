package solid.example.models;

import lombok.Data;

import java.util.Scanner;

@Data
public class Rectangle implements Figure {

    private Double width;
    private Double height;

    public Double getArea() {

        return width * height;
    }

    public Figure createFigureFromUserInput() {

        Scanner inputObj = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the rectangle width: ");
        Double width = inputObj.nextDouble();
        System.out.println("Enter the rectangle height: ");
        Double height = inputObj.nextDouble();

        rectangle.setWidth(width);
        rectangle.setHeight(height);

        return rectangle;
    }
}
