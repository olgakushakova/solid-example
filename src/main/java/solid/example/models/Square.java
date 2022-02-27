package solid.example.models;

import lombok.Data;

import java.util.Scanner;

@Data
public class Square implements Figure {

    private Double sideLength;

    public Double getArea() {

        return sideLength * sideLength;
    }

    public Square createFigureFromUserInput() {

        Scanner inputObj = new Scanner(System.in);

        Square square = new Square();

        System.out.println("Enter length of the square side: ");
        Double length = inputObj.nextDouble();

        square.setSideLength(length);

        return square;
    }
}
