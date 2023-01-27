package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes;

    public ShapeCollector() {
        shapes = new ArrayList<>();

    }

    public void addFigure(Shape shape) {
        shapes.add(shape);

    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getShape(int n){
        return shapes.get(n);
    }
}

