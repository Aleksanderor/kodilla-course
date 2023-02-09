package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Nested
@DisplayName("testing ShapeCollector class")


public class ShapeCollectorTestSuite {
    static int testCounter = 0;
    private ShapeCollector shapeCollector;
    @BeforeEach
    public void beforeEveryTest() {
        shapeCollector = new ShapeCollector();
        System.out.println("Test#: " + (++testCounter) + " starting..");
    }

    @AfterEach
    public void afterEachTest(){
        System.out.println("Test# " + testCounter + " has been finished");
    }

    @Test
    @DisplayName("When using getShape method +" +
            "then it should get the waned object")

    void testGetShape() {
        //given
        Shape square = new Square(5);
        shapeCollector.addFigure(square);

        //when
        Shape shape = shapeCollector.getShape(0);

        //then
        assertEquals("square", shape.getShapeName());
        assertEquals(25, shape.getArea());
    }
    @Test
    @DisplayName("When adding a new shape " +
            "then it should add the new shape to the ArrayList<Shape>")
    void testAddShape() {

        //given
        Square square = new Square(5);

        //when
        shapeCollector.addFigure(square);
        ArrayList<Shape> shapes = shapeCollector.getShapes();

        //then
        assertEquals(1, shapes.size());
        assertEquals("square", shapes.get(0).getShapeName());
        assertEquals(25, shapes.get(0).getArea());
    }

    @Test
    @DisplayName("When removing a shape form the ArrayList<Shape> +" +
            "it shoud remove the shape from ArrayList<Shape>")

    void testRemoveShape(){

        //given
        Triangle triangle = new Triangle(3.0,3.0);
        shapeCollector.addFigure(triangle);

        //when
        shapeCollector.removeFigure(triangle);


        //then
        ArrayList<Shape> shapes = shapeCollector.getShapes();
        assertEquals(0,shapes.size());

    }
    @Test
    @DisplayName("When wanting to get all Shapes in one string +" +
            "then it should print the shapes form ArrayList<Shape> in one string")
    void testGetShapes() {

        //given
        Triangle triangle = new Triangle(3.0, 3.0);
        Square square = new Square(10);
        Circle circle = new Circle(8);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        //when
        String figureNames = shapeCollector.showFigures();

        //then
        assertEquals("triangle circle square ", shapeCollector.showFigures());
    }

}




