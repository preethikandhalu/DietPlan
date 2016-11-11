/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * MealAbstractClass abstract class
 */

package kandhalu.assign2.meal;

import kandhalu.assign2.mealCategory.MealCategory;
import kandhalu.assign2.mealCategory.Recipe;

public abstract class MealAbstractClass implements Meal {
	protected Recipe recipe;
	protected MealCategory mealCategory;
	
	//Constructor
	public MealAbstractClass(MealCategory mealCategory){
		this.mealCategory=mealCategory;
		this.recipe = this.mealCategory.getARecipe();
	}
	
	//getter methods
	public Recipe getARecipe(){
		return this.recipe;
	}
	
	//Class related methods
	public int getCalories(){
		return this.recipe.getCalories();
	}
	
}
