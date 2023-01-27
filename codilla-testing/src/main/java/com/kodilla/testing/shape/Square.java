package com.kodilla.testing.shape;

class Square implements Shape {
    private double side;

    Square(double side){
        this.side = side;
    }
    @Override
    public String getShapeName() {
        return "square";
    }
    @Override
    public Double getArea(){
        return side * side;
    }
}
