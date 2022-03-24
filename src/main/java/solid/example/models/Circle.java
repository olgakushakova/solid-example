package solid.example.models;

import lombok.Data;


@Data
public class Circle implements Figure {

    private Double radius;

    public Double getArea() {

        return Math.PI * radius * radius;
    }
}
