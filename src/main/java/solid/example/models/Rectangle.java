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

}
