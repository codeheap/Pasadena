package ch.froorider.cheesecakefactory_jeeservice.controller;

import javax.enterprise.context.*;
import javax.inject.Named;
import java.util.*;
import ch.froorider.cheesecakefactory_jeeservice.entity.*;

@ApplicationScoped
@Named("MealService")
public class MealService {

	private List<Meal> meals = Arrays.asList(
			new Meal("Pizza", "Ham and Mushrooms", 10),
			new Meal("Burger", "with a lot of beacon", 11), 
			new Meal("Kebab", "very spicy", 12));

	public MealService() {
	}

	public List<Meal> getMenus() {
		return meals;
	}

	public Meal getMealByName(String name) {
		System.out.println("Looking for:"+name);
		Meal foundMeal = this.meals.stream()
				.filter(x -> x.getName().equalsIgnoreCase(name))
				.findAny()
				.get();
		System.out.println("Found meal: "+foundMeal.getDescription());
		return foundMeal;
	}
}
