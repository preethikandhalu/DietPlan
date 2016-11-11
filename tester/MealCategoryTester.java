/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * MealCategoryTester class
 * class to test mealCategory package
 */

package kandhalu.assign2.tester;

import java.io.IOException;

import kandhalu.assign2.mealCategory.MealCategory;
import kandhalu.assign2.mealCategory.Recipe;
import kandhalu.assign2.mealCategory.VeganMeal;

public class MealCategoryTester {

	public static void tester () throws IOException {
		MealCategory test = new VeganMeal();
		//loadRecipes method
		test.loadRecipes("VeganRecipes.txt");
		//showRecipes method
		//make sure all recipes are loaded
		System.out.println("****PRINTS ALL RECIPES****");
		for (Recipe each: test.showRecipes()){
			System.out.println(each);
			System.out.println();
		}
		
		//getARecipe and removeRecipe method
		//Make sure it prints randomly
		System.out.println("****RANDOM RECIPES****");
		Recipe recipe1 = test.getARecipe();
		System.out.println("RECIPE1");
		System.out.println(recipe1);
		System.out.println();
		
		test.removeRecipe(recipe1);
		System.out.println("AFTER REMOVING RECIPE1");
		for (Recipe each: test.showRecipes()){
			System.out.println(each);
			System.out.println();
		}
		
		Recipe recipe2 = test.getARecipe();
		System.out.println("RECIPE2");
		System.out.println(recipe2);
		System.out.println();
		
		test.removeRecipe(recipe2);
		System.out.println("AFTER REMOVING RECIPE2");
		for (Recipe each: test.showRecipes()){
			System.out.println(each);
			System.out.println();
		}
		
		Recipe recipe3 = test.getARecipe();
		System.out.println("Recipe3");
		System.out.println(recipe3);
		System.out.println();
		System.out.println();
		
		test.removeRecipe(recipe3);
		System.out.println("AFTER REMOVING RECIPE3");
		for (Recipe each: test.showRecipes()){
			System.out.println(each);
			System.out.println();
		}
	}
	
}
