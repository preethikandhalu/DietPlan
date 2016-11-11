/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * ClientApplication class
 * Check if client interface works as intended
 */
package kandhalu.assign2.application;

import java.io.IOException;

import kandhalu.assign2.dietPlanOrder.DietPlanOrder;
import kandhalu.assign2.dietPlanOrder.MealType;

public class ClientApplication {

	public static void main(String[] args) throws IOException {
		System.out.println("================================Vegan Diet Plan===================================");
		DietPlanOrder veganPlanOrder = new DietPlanOrder("Preethi Kandhalu", "VeganRecipes.txt", MealType.VEGAN);
		veganPlanOrder.acceptPayment("MasterCard", "5134394777923385", veganPlanOrder.getCost());
		veganPlanOrder.generateInvoice();
		System.out.println();
		
		System.out.println("================================Low Carb Diet Plan================================");
		DietPlanOrder lowCarbPlanOrder = new DietPlanOrder("Preethi Kandhalu", "LowCarbRecipes.txt", MealType.LOW_CARB);
		lowCarbPlanOrder.acceptPayment("Visa", "4534394777923385", lowCarbPlanOrder.getCost());
		lowCarbPlanOrder.generateInvoice();
		System.out.println();
		
		System.out.println("================================High Carb Diet Plan================================");
		DietPlanOrder highCarbPlanOrder = new DietPlanOrder("Preethi Kandhalu", "HighCarbRecipes.txt", MealType.HIGH_CARB);
		highCarbPlanOrder.acceptPayment("Visa", "4534394923385", highCarbPlanOrder.getCost());
		highCarbPlanOrder.generateInvoice();
	}
}
