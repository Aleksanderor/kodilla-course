package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Nested
@DisplayName("testing ShapeCollector class")


public class ShapeCollectorTestSuite {
    int testCounter = 0;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @AfterEach
    public void afterEachTest(){
        testCounter++;
            System.out.println("Executed test #" + testCounter);

        }

    @Test
    @DisplayName("When using getShape method then it should get the waned object")
    void testGetShape() {
        ShapeCollector shapecollector = new ShapeCollector();

        Shape square = new Square(5);
        shapecollector.addFigure(square);
        Shape shape = shapecollector.getShape(0);
        assertEquals("square", shape.getShapeName());
        assertEquals(25, shape.getArea());
    }
    @Test
    @DisplayName("When adding a new shape " +
            "then it should add the new shape to the ArrayList<Shape>")
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
    @DisplayName("When removing a shape form the ArrayList<Shape> +" +
            "it shoud remove the shape from ArrayList<Shape>")
    void testRemoveShape(){
        ShapeCollector shapecollector = new ShapeCollector();
        Triangle triangle = new Triangle(3.0,3.0);
        shapecollector.addFigure(triangle);
        shapecollector.removeFigure(triangle);
        ArrayList<Shape> shapes = shapecollector.shapes;
        assertEquals(0,shapes.size());

    }
    @Test
    @DisplayName("When wanting to get all Shapes in one string +" +
            "then it should print the shapes form ArrayList<Shape> in one string")
    void testGetShapes() {

        ShapeCollector shapecollector = new ShapeCollector();
        Triangle triangle = new Triangle(3.0, 3.0);
        Square square = new Square(10);
        Circle circle = new Circle(8);
        shapecollector.addFigure(triangle);
        shapecollector.addFigure(circle);
        shapecollector.addFigure(square);

        String figureNames = shapecollector.showFigures();
        assertEquals("triangle circle square ", shapecollector.showFigures());
    }

}




