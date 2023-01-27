package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCollectorTestSuite {


    @Test
    void testGetShape() {
        ShapeCollector shapecollector = new ShapeCollector();

        Shape square = new Square(5);
        shapecollector.addFigure(square);
        Shape shape = shapecollector.getShape(0);
        assertEquals("square", shape.getShapeName());
        assertEquals(25, shape.getArea());
    }
    @Test
    void testAddShape() {
        ShapeCollector shapecollector = new ShapeCollector();
        Square square = new Square(5);
        shapecollector.addFigure(square);
        ArrayList<Shape> shapes = shapecollector.shapes;
        assertEquals(1, shapes.size());
        assertEquals("square", shapes.get(0).getShapeName());
        assertEquals(25, shapes.get(0).getArea());
    }

    @Test
    void testRemoveShape(){
        ShapeCollector shapecollector = new ShapeCollector();
        Triangle triangle = new Triangle(3.0,3.0);
        shapecollector.addFigure(triangle);
        shapecollector.removeFigure(triangle);
        ArrayList<Shape> shapes = shapecollector.shapes;
        assertEquals(0,shapes.size());

    }
    @Test
    @DisplayName("When adding new shapes")
    void testGetShapes() {

        ShapeCollector shapecollector = new ShapeCollector();
        Triangle triangle = new Triangle(3.0, 3.0);
        Square square = new Square(10);
        Circle circle = new Circle(8);
        shapecollector.addFigure(triangle);
        shapecollector.addFigure(circle);
        shapecollector.addFigure(square);

        String figureNames = shapecollector.getShapeNames();
        assertEquals("triangle circle square ", shapecollector.getShapeNames());
    }

}




