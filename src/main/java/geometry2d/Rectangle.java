package geometry2d;

import exceptions.InvalidDimensionException;

public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new InvalidDimensionException("Width and height must be positive");
        }
        this.width = width;
        this.height = height;
    }

    @Override public double area() {
        return width * height;
    }

    @Override public double perimeter() {
        return 2 * (width + height);
    }

    @Override public String toString() {
        return String.format("Rectangle: width=%.2f, height=%.2f, area=%.2f, perimeter=%.2f", width, height, area(), perimeter());
    }
}