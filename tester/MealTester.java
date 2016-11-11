/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * Meal class
 * class to test meal package
 */

package kandhalu.assign2.tester;

import java.io.IOException;

import kandhalu.assign2.meal.*;
import kandhalu.assign2.mealCategory.*;

public class MealTester {
	
	public static void tester() throws IOException{
		//Test the Lunch class
		MealCategory l = new LowCarbMeal();
		l.loadRecipes("VeganRecipes.txt");
		Meal lunchTest = new Lunch(l);
	
		System.out.println("getCalories method");
		System.out.println(lunchTest.getCalories());
		System.out.println();
		
		System.out.println("getCost method");
		System.out.println(lunchTest.getCost());
		System.out.println();
		
		System.out.println("getDetails method");	
		System.out.println(lunchTest.getDetails()); 
		System.out.println();
		
		//Test the Dinner class 1
		MealCategory d = new HighCarbMeal();
		d.loadRecipes("VeganRecipes.txt");
		Meal dinnerTest = new Dinner(d);
		
		System.out.println("getCalories method");
		System.out.println(dinnerTest.getCalories());
		System.out.println();
		
		System.out.println("getCost method");
		System.out.println(dinnerTest.getCost());
		System.out.println();
		
		System.out.println("getDetails method");	
		System.out.println(dinnerTest.getDetails()); 
		System.out.println();
		
		//Test the Dinner class 2
		Dinner dinnerTest2 = new Dinner(d);
		dinnerTest2.setDeliveryFee(15.00);
		
		System.out.println("Delivery Fee");
		System.out.println(dinnerTest2.getDeliveryFee());
		System.out.println();
		
		System.out.println("getCalories method");
		System.out.println(dinnerTest2.getCalories());
		System.out.println();
				
		System.out.println("getCost method");
		System.out.println(dinnerTest2.getCost());
		System.out.println();
				
		System.out.println("getDetails method");	
		System.out.println(dinnerTest2.getDetails()); 
	}
}
