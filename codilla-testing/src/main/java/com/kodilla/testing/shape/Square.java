package com.kodilla.testing.shape;

class Square implements Shape {
    private double side;

    private Square(double side){
        this.side = side;
    }
    @Override
    public String getShapeName() {
        return "Square";
    }
    @Override
    public Double getArea(){
        return side * side;
    }
}
