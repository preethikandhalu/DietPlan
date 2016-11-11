/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * VeganDietPlan class
 */

package kandhalu.assign2.dietPlan;

import java.io.IOException;

import kandhalu.assign2.meal.Dinner;
import kandhalu.assign2.meal.Lunch;
import kandhalu.assign2.mealCategory.*;

public class VeganDietPlan extends DietPlanAbstractClass {
	public VeganMeal veganMeal;
	
	//Constructor
	public VeganDietPlan(String filename, int dayOfWeek) throws IOException{
		super(filename, dayOfWeek);
		this.veganMeal = new VeganMeal();
		
		//Load recipes
		this.veganMeal.loadRecipes(this.filename);
		
		//Assign lunch
		this.lunch = new Lunch(veganMeal);
		//Remove lunch recipe from available recipes, so dinner isn't repeated
		this.veganMeal.removeRecipe(this.lunch.getARecipe());
		//Assign dinner
		this.dinner = new Dinner(veganMeal);
	}
}
