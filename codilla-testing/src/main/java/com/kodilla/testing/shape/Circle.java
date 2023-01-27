package com.kodilla.testing.shape;

class Circle implements Shape {

    private double radius;
    private double pi = 3.14;

    Circle(double radius) {
        this.radius = radius;
        this.pi = pi;
    }
    @Override
    public String getShapeName () {
        return "circle";
    }
    @Override
    public Double getArea(){
        return pi*(radius*radius);
    }
}
