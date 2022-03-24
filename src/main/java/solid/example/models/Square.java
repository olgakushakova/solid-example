package solid.example.models;

import lombok.Data;


@Data
public class Square implements Figure {

    private Double sideLength;

    public Double getArea() {

        return sideLength * sideLength;
    }
}
