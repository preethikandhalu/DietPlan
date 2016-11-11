/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * DietPlanTester class
 * class to test dietplan package
 */

package kandhalu.assign2.tester;

import java.io.IOException;

import kandhalu.assign2.dietPlan.*;

public class DietPlanTester {
	public static void tester() throws IOException{
		DietPlan test = new VeganDietPlan("VeganRecipes.txt", 4);
		System.out.println(test.getCostOfPlan());
		System.out.println();
		System.out.println(test.showPlan());
	}
}
