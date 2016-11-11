/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * LowCarbDietPlan class
 */

package kandhalu.assign2.dietPlan;

import java.io.IOException;

import kandhalu.assign2.meal.Dinner;
import kandhalu.assign2.meal.Lunch;
import kandhalu.assign2.mealCategory.LowCarbMeal;

public class LowCarbDietPlan extends DietPlanAbstractClass{
	public LowCarbMeal lowCarbMeal;
	
	//Constructor
	public LowCarbDietPlan(String filename, int dayOfWeek) throws IOException{
		super(filename, dayOfWeek);
		this.lowCarbMeal = new LowCarbMeal();
		
		//Load recipes
		this.lowCarbMeal.loadRecipes(this.filename);
		
		//Assign lunch
		this.lunch = new Lunch(lowCarbMeal);
		//Remove lunch recipe from available recipes, so dinner isn't repeated
		this.lowCarbMeal.removeRecipe(this.lunch.getARecipe());
		//Assign dinner
		this.dinner = new Dinner(lowCarbMeal);
	}
}
