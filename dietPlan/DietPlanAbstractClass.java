/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * DietPlanAbstractClass abstract class
 */

package kandhalu.assign2.dietPlan;

import kandhalu.assign2.meal.Meal;

public abstract class DietPlanAbstractClass implements DietPlan{
	protected Meal lunch;
	protected Meal dinner;
	protected String filename;
	private String dayOfWeek;
	public static final String[] DAYS_OF_WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	
	//Constructor
	public DietPlanAbstractClass(String filename, int dayOfWeek){
		this.filename = filename;
		//Set to a default of "Monday" if parameter not between 1-7
		if (dayOfWeek>7 || dayOfWeek<1){
			this.dayOfWeek="Monday";
		}
		else{
			this.dayOfWeek = DAYS_OF_WEEK[dayOfWeek-1];
		}
	}
	//Class related methods
	
	/*Returns a description of lunch and dinner */
	public String showPlan(){
		String toReturn = "Lunch:\n" + this.lunch.getDetails() +
						  "\n\nDinner:\n" + this.dinner.getDetails() +
						  "\n\nTotal Cost: $" + String.format("%.2f", this.getCostOfPlan()) +
						  "\nDay of Week: " + this.dayOfWeek;
		return toReturn;
	}
	
	/*Return the total cost of lunch and dinner.*/
	public double getCostOfPlan(){
		return this.lunch.getCost() + this.dinner.getCost();
	}
}
