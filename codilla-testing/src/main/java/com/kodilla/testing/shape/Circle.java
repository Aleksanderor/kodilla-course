package com.kodilla.testing.shape;

class Circle implements Shape {

    private double radius;
    private double pi;

    private Circle (double radius,double pi) {
        this.radius = radius;
        this.pi = pi;
    }
    @Override
    public String getShapeName () {
        return "Circle";
    }
    @Override
    public Double getArea(){
        return pi*(radius*radius);
    }
}
