package solid.example.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    protected Square initSquare() {
        return new Square();
    }

    @Test
    void areaOfSquare_4_shouldReturn16() {

        Square square = initSquare();
        square.setSideLength(Double.valueOf(4));

        System.out.println("Width: " + square.getSideLength());
        System.out.println("Area: " + square.getArea());
        assertEquals(16, square.getArea());
    }
}
