/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * DietPlanOrderTesterclass
 * Class to check dietplanorder package
 */

package kandhalu.assign2.tester;

import java.io.IOException;

import kandhalu.assign2.dietPlanOrder.DietPlanOrder;
import kandhalu.assign2.dietPlanOrder.MealType;

public class DietPlanOrderTester {
	public static void tester() throws IOException{
		DietPlanOrder planOrder = new DietPlanOrder("Preethi Kandhalu", "VeganRecipes.txt", MealType.VEGAN);
		System.out.println(planOrder.getCost());
		planOrder.acceptPayment("MasterCard", "5034394777923385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//False
		planOrder.acceptPayment("MasterCard", "5134394777923385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//True
		planOrder.acceptPayment("MasterCard", "5234394777923385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//True
		planOrder.acceptPayment("MasterCard", "5334394777923385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//True
		planOrder.acceptPayment("MasterCard", "5434394777923385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//True
		planOrder.acceptPayment("MasterCard", "5534394777923385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//True
		planOrder.acceptPayment("MasterCard", "5634394777923385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//False
		planOrder.acceptPayment("MasterCard", "1634394777923385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//False
		planOrder.acceptPayment("MasterCard", "163439423385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//False
		
		planOrder.acceptPayment("Visa", "1534394923385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//False
		planOrder.acceptPayment("Visa", "453439923385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//False
		planOrder.acceptPayment("Visa", "4534394777923385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//True
		planOrder.acceptPayment("Visa", "4534394923385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//True
		
		planOrder.acceptPayment("Junk", "4534394923385", planOrder.getCost());
		System.out.println(planOrder.isPaid());		//False

		planOrder.generateInvoice();		
	}
}
