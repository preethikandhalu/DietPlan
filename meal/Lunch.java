/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * Lunch class
 */

package kandhalu.assign2.meal;
import kandhalu.assign2.mealCategory.MealCategory;

public class Lunch extends MealAbstractClass{
	
	//Constructor
	public Lunch(MealCategory mealCategory){
		super(mealCategory);
	}
	
	//Class related methods
	/*Return cost for the recipe*/
	public double getCost(){
		return this.recipe.getCost();
	}
	
	/*Return a String with the recipe name, description, calories and cost of recipe*/
	public String getDetails(){
		return this.recipe.toString();
	}
	
}
