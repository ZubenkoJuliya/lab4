package org.example;

import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import exceptions.InvalidDimensionException;
import exceptions.InvalidFigureException;

public class Main {
    public static void main(String[] args) {
        // Тестирование с корректными значениями
        try {
            Circle circle = new Circle(5);
            System.out.println(circle);

            Rectangle rectangle = new Rectangle(4, 6);
            System.out.println(rectangle);

            Cylinder cylinder = new Cylinder(circle, 10);
            System.out.println(cylinder);
        } catch (InvalidDimensionException | InvalidFigureException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        // Тестирование Circle с некорректным значением
        try {
            Circle invalidCircle = new Circle(-3);
            System.out.println(invalidCircle);
        } catch (InvalidDimensionException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Тестирование Rectangle с некорректным значением
        try {
        Rectangle invalidRectangle = new Rectangle(0, 5);
        System.out.println(invalidRectangle);
        } catch (InvalidDimensionException e) {
        System.out.println("Exception caught: " + e.getMessage());
        }

        // Тестирование Cylinder с некорректным основанием
        try {
        Cylinder invalidCylinder = new Cylinder(null, 7);
        System.out.println(invalidCylinder);
        } catch (InvalidFigureException e) {
        System.out.println("Exception caught: " + e.getMessage());
        }

        // Тестирование Cylinder с некорректной высотой
        try {
        Circle validCircle = new Circle(4);
        Cylinder invalidCylinderHeight = new Cylinder(validCircle, -5);
            System.out.println(invalidCylinderHeight);
        } catch (InvalidDimensionException e) {
        System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
