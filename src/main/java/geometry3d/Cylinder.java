package geometry3d;

import geometry2d.Figure;
import exceptions.InvalidDimensionException;
import exceptions.InvalidFigureException;

public class Cylinder {
    private Figure base;
    private double height;

    public Cylinder(Figure base, double height) {
        if (base == null) {
            throw new InvalidFigureException("Base figure cannot be null");
        }
        if (height <= 0) {
            throw new InvalidDimensionException("Height must be positive");
        }
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    @Override public String toString() {
        return String.format("Cylinder: base=[%s], height=%.2f, volume=%.2f", base.toString(), height, volume());
    }
}