/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * HighCarbDietPlan class
 */

package kandhalu.assign2.dietPlan;

import java.io.IOException;

import kandhalu.assign2.meal.Dinner;
import kandhalu.assign2.meal.Lunch;
import kandhalu.assign2.mealCategory.HighCarbMeal;

public class HighCarbDietPlan extends DietPlanAbstractClass {
	public HighCarbMeal highCarbMeal;
	
	//Constructor
	public HighCarbDietPlan(String filename, int dayOfWeek) throws IOException{
		super(filename, dayOfWeek);
		this.highCarbMeal = new HighCarbMeal();
		
		//Load recipes
		this.highCarbMeal.loadRecipes(this.filename);
		
		//Assign lunch
		this.lunch = new Lunch(highCarbMeal);
		//Remove lunch recipe from available recipes, so dinner isn't repeated
		this.highCarbMeal.removeRecipe(this.lunch.getARecipe());
		//Assign dinner
		this.dinner = new Dinner(highCarbMeal);
	}
}
