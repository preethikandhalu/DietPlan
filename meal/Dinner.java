/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * Dinner class
 */

package kandhalu.assign2.meal;

import kandhalu.assign2.meal.MealAbstractClass;
import kandhalu.assign2.mealCategory.MealCategory;

public class Dinner extends MealAbstractClass {
	private boolean delivery;
	private double deliveryFee;
	
	//Constructor
	public Dinner(MealCategory mealCategory){
		super(mealCategory);
		this.deliveryFee=3.99;
	}
	
	//Getters and Setters
	public void setDeliverable(boolean isDeliverable){
		this.delivery=isDeliverable;
	}
	
	public boolean isDeliverable(){
		return this.delivery;
	}
	
	public void setDeliveryFee(double deliveryFee){
		if (deliveryFee>=0){
			this.deliveryFee=deliveryFee;
		}
	}
	
	public double getDeliveryFee(){
		return this.deliveryFee;
	}
	
	//Class related methods
	/*Return cost for the recipe + deliveryFee*/
	public double getCost(){
		return this.recipe.getCost() + this.deliveryFee;
	}
	
	/*Return a String with the recipe name, description, calories and cost 
	of recipe and the delivery fee.*/
	public String getDetails(){
		String toReturn = this.recipe.toString();
		toReturn += "\nDeliver Fee: $" + this.deliveryFee;
		return toReturn;
	}	
}
