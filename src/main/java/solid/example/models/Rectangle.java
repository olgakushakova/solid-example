package solid.example.models;

import lombok.Data;

@Data
public class Rectangle extends Figure {

    private Double width;
    private Double height;

    public Double getArea() {

        return width * height;
    }
}