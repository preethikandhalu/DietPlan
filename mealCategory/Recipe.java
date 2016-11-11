/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * Recipe class
 */

package kandhalu.assign2.mealCategory;

public class Recipe {
	private String name;
	private String description;
	private double cost;
	private int calories;
	
	//Constructors
	public Recipe (){
		this.name="";
		this.description="";
		this.cost=0.0;
		this.calories=0;
	}
	
	public Recipe(String name, String description, double cost, int calories){
		this.name=name;
		this.description=description;
		//check cost
		if (cost<=0){
			this.cost=0.0;
		}
		else{
			this.cost=cost;
		}
		
		//check calories
		if (calories<0){
			this.calories=0;
		}
		else{
			this.calories=calories;
		}
	}
	
	//Getter and setter methods
	public void setName(String name){
		this.name=name;
	}
	
	public void setDescription(String discription){
		this.description=discription;
	}
	
	public void setCost(double cost){
		if (cost>0){
			this.cost=cost;
		}
	}
	
	public void setCalories(int calories){
		//Check if calories is less than 0 
		if (calories>=0){
			this.calories=calories;
		}
	}

	public String getName(){
		return this.name;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public double getCost(){
		return this.cost;
	}
	
	public int getCalories(){
		return this.calories;
	}

	//@override
	public String toString(){
		String toReturn = "Name: " + this.name +
						  "\nDescription: " + this.description + 
						  "\nCalories: " + this.calories +
						  "\nCost: $" + String.format("%.2f", this.cost);
		return toReturn;
	}
}
