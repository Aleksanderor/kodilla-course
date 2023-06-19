package patterns2;

import com.kodilla.hibernate.Patterns2.pizza.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    private PizzaOrder pizzaOrder;

    @BeforeEach
    public void setUp() {
        pizzaOrder = new StandardPizzaOrder();
    }


    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        pizzaOrder = new StandardPizzaOrder();

        // When
        BigDecimal cost = pizzaOrder.getCost();

        // Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new StandardPizzaOrder();

        // When
        String description = pizzaOrder.getDescription();

        // Then
        assertEquals("Pizza ingredients: crust, cheese, sauce", description);
    }

    @Test
    public void testSalamiPizzaOrderGetCost() {
        // Given
        pizzaOrder = new Salami(pizzaOrder);

        // When
        BigDecimal cost = pizzaOrder.getCost();

        // Then
        assertEquals(new BigDecimal(22), cost);
    }

    @Test
    public void testSalamiPizzaOrderGetDescription() {
        // Given
        pizzaOrder = new Salami(pizzaOrder);

        // When
        String description = pizzaOrder.getDescription();

        // Then
        assertEquals("Pizza ingredients: crust, cheese, sauce, salami", description);
    }

    @Test
    public void testHamAndMushroomsPizzaOrderGetCost() {
        // Given
        pizzaOrder = new Ham(pizzaOrder);
        pizzaOrder = new Mushrooms(pizzaOrder);

        // When
        BigDecimal cost = pizzaOrder.getCost();

        // Then
        assertEquals(new BigDecimal(23), cost);
    }

    @Test
    public void testHamAndMushroomsPizzaOrderGetDescription() {
        // Given
        pizzaOrder = new Ham(pizzaOrder);
        pizzaOrder = new Mushrooms(pizzaOrder);

        // When
        String description = pizzaOrder.getDescription();

        // Then
        assertEquals("Pizza ingredients: crust, cheese, sauce, ham, mushrooms", description);
    }

    @Test
    public void testSalamiHamMushroomsOnionsPizzaOrderGetCost() {
        // Given
        pizzaOrder = new Salami(pizzaOrder);
        pizzaOrder = new Ham(pizzaOrder);
        pizzaOrder = new Mushrooms(pizzaOrder);
        pizzaOrder = new Onions(pizzaOrder);

        // When
        BigDecimal cost = pizzaOrder.getCost();

        // Then
        assertEquals(new BigDecimal(33), cost);
    }

    @Test
    public void testSalamiHamMushroomsOnionsPizzaOrderGetDescription() {
        // Given
        pizzaOrder = new Salami(pizzaOrder);
        pizzaOrder = new Ham(pizzaOrder);
        pizzaOrder = new Mushrooms(pizzaOrder);
        pizzaOrder = new Onions(pizzaOrder);

        // When
        String description = pizzaOrder.getDescription();

        // Then
        assertEquals("Pizza ingredients: crust, cheese, sauce, salami, ham, mushrooms, onions", description);
    }
}