package ch.froorider.cheesecakefactory_jeeservice.boundary;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ch.froorider.cheesecakefactory_jeeservice.controller.MealService;
import ch.froorider.cheesecakefactory_jeeservice.entity.Meal;

@Path("/meals")
public class MealResource {

	@Inject
	private MealService service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Meal> getMenuList() {
		return service.getMenus();
	}
	
	@GET
	@Path("{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Meal getMealByName(@PathParam("name") String mealName){
		System.out.println("Looking for:"+mealName);
		return service.getMealByName(mealName);
	}

}
