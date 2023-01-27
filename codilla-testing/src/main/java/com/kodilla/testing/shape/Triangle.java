package com.kodilla.testing.shape;

class Triangle implements Shape {

    private double side;
    private double height;

    Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }
    @Override
    public String getShapeName () {
        return "triangle";

    }
    @Override
    public Double getArea () {
        return side * height;

    }
}
