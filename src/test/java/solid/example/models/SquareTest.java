package solid.example.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest extends RectangleTest {

    @Override
    protected Rectangle initRectangle() {
        return new Square();
    }

    @Test
    void areaOfRectangle_4_5_shouldReturn20() {

        Rectangle rectangle = initRectangle();
        rectangle.setHeight(Double.valueOf(4));
        rectangle.setWidth(Double.valueOf(5));

        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        assertEquals(20, rectangle.getArea());
    }
}
