/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * DietPlanOrder class
 */

package kandhalu.assign2.dietPlanOrder;

import java.io.IOException;
import java.text.*;
import java.util.*;

import kandhalu.assign2.dietPlan.*;

public class DietPlanOrder {
	private String customerName;
	private DietPlan plan;
	private boolean paymentStatus;
	
	//Constructor
	public DietPlanOrder(String customerName, String filename, MealType mealType) throws IOException{
		this.customerName=customerName;
		
		//Generate number between 0-7 to assign a random day of week in DietPlan constructor
		Random rand = new Random();
		int randomNum = rand.nextInt(8);
		
		if (mealType == MealType.VEGAN){
			this.plan= new VeganDietPlan(filename, randomNum);
		}
		else if (mealType == MealType.LOW_CARB){
			this.plan= new LowCarbDietPlan(filename, randomNum);
		}
		else if (mealType == MealType.HIGH_CARB){
			this.plan= new HighCarbDietPlan(filename, randomNum);
		}
	}
	
	//Getters and setters
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	
	public boolean isPaid(){
		return this.paymentStatus;
	}
	
	public String getCustomerName(){
		return this.customerName;
	}

	public DietPlan getPlan(){
		return this.plan;
	}
	
	//Class related methods
	/*Returns total cost*/
	public double getCost(){
		return this.plan.getCostOfPlan();
	}
	
	/*If the card number is valid according to rules below, paymentStatus is set to true.
	Otherwise, to false*/
	public boolean acceptPayment(String cardName, String cardNumber, double amount){
		//MasterCard
		if (cardName=="MasterCard"){
			char firstChar = cardNumber.charAt(0);
			if (cardNumber.length()==16 && firstChar=='5'){
				char secondChar = cardNumber.charAt(1);
				if (secondChar=='1' || secondChar=='2' || secondChar=='3' || secondChar=='4' || secondChar=='5'){
					this.paymentStatus=true;
					return true;
				}
			}
		}
		
		//Visa
		if (cardName=="Visa"){
			if (cardNumber.length()==13 || cardNumber.length()==16){
				char firstChar = cardNumber.charAt(0);
				if (firstChar=='4'){
					this.paymentStatus=true;
					return true;
				}
			}
		}
		this.paymentStatus=false;
		return false;
	}
	
	/*Displays the following:
		a)	Customer Name
		b)	Today’s Date
		c)	Details of Diet Plan: These include the recipe details of lunch and dinner.*/
	public void generateInvoice(){
		String name = this.customerName;
		System.out.println("CUSTOMER NAME: \t\t" + name);

		DateFormat df = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
		Date dateobj = new Date();
		String todaysDate = df.format(dateobj); 
		System.out.println("TODAYS DATE: \t\t" + todaysDate);
		
		String details = this.plan.showPlan();
		System.out.println("\n--------------------------------DETAILS OF DIET PLAN------------------------------- \n" + details);
	}
}
