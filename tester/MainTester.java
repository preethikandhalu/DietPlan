/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * MainTester class
 * Class to print results from all tester classes in this package
 */

package kandhalu.assign2.tester;

import java.io.IOException;

public class MainTester {

	public static void mainTester(String[] args) throws IOException {
		System.out.println("MEAL CATEGORY TESTER");
		MealCategoryTester.tester();
		System.out.println("######################################################################################");
		
		System.out.println("MEAL TESTER");
		MealTester.tester();
		System.out.println("######################################################################################");
		
		System.out.println("DIET PLAN TESTER");
		DietPlanTester.tester();
		System.out.println("######################################################################################");
		
		System.out.println("DIET PLAN ORDER TESTER");
		DietPlanOrderTester.tester();
		System.out.println("######################################################################################");		
	}
}
