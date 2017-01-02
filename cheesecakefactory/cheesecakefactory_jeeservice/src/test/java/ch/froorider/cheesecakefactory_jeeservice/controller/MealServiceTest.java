package ch.froorider.cheesecakefactory_jeeservice.controller;

import ch.froorider.cheesecakefactory_jeeservice.entity.Meal;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Thomas on 25.11.2016.
 */
class MealServiceTest {
    @Test
    void getMenus() {
        Meal expected = new Meal("Pizza", "Ham and Mushrooms", 10);
        MealService service = new MealService();
        List<Meal> meals = service.getMenus();
        assertNotNull(meals);
        assertEquals(meals.size(),3);
    }

    @Test
    void getMealByName() {
        MealService service = new MealService();
        Meal expected = service.getMealByName("Burger");
        assertNotNull(expected);
        assertEquals("Burger",expected.getName());
    }

}