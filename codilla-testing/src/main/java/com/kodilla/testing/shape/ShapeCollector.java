package com.kodilla.testing.shape;

import java.util.ArrayList;

class ShapeCollector {

    private ArrayList<Shape> shapes;

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

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

    public String showFigures(){
        StringBuilder stringBuilder = new StringBuilder();
            for (Shape shape:shapes) {
                stringBuilder.append(shape.getShapeName()+ " ");
            }
            return stringBuilder.toString();
    }

}

