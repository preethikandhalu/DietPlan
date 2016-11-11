/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * MealCategory interface
 */

package kandhalu.assign2.mealCategory;

import java.io.IOException;
import java.util.ArrayList;

public interface MealCategory {
	public ArrayList<Recipe> showRecipes();
	public Recipe getARecipe();
	public void loadRecipes(String filename) throws IOException;
	public void removeRecipe(Recipe recipe);
}