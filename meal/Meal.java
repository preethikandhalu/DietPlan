/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * Meal Interface
 */

package kandhalu.assign2.meal;

import kandhalu.assign2.mealCategory.Recipe;

public interface Meal {
	public Recipe getARecipe();
	public int getCalories();
	public double getCost();
	public String getDetails();
}
