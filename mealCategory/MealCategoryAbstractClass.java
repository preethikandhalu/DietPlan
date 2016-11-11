/**
 * @author Preethi Kandhalu (W1192362)
 * COEN 275: Object-Oriented Analysis, Design and Programming
 * Fall 2016
 * Assignment 2
 * MealCategoryAbstractClass abstract class
 */

package kandhalu.assign2.mealCategory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public abstract class MealCategoryAbstractClass implements MealCategory {
	private ArrayList<Recipe> recipeList;
	
	//Constructor
	public MealCategoryAbstractClass(){
		this.recipeList = new ArrayList<Recipe>();
	}
	
	//Getter methods
	public ArrayList<Recipe> showRecipes(){
		return this.recipeList;
	}
	
	//Class related methods
	/*Return a randomly picked recipe from recipeList */
	public Recipe getARecipe(){
		int size = this.recipeList.size();
		Random rand = new Random();
		int randomNum = rand.nextInt(size);
		return recipeList.get(randomNum);		
	}
	
	/*Opens the file with the filename, read the contents, line by line. 
	 * Each line will contains the Recipe name, description, calories and cost. 
	 * The line will be tokenized by fields - an instance of a Recipe populated with
	 *  the field values will be added to the recipeList.*/
	public void loadRecipes(String filename) throws IOException{
			BufferedReader br = new BufferedReader(new FileReader(filename));
		    String line;
		    Scanner s; 
		    String [] tokens;
		    while ((line = br.readLine()) != null) {
		    	s = new Scanner(line);
		   		s.useDelimiter(":");
		   		int i =0;
		   		tokens = new String[4];
		   		while (s.hasNext()) {
		   			tokens[i]=s.next();
		   			i++;
		   		} 
		   		Recipe temp = new Recipe(tokens[0], tokens[1], convertStringToDouble(tokens[2]), convertStringToInt(tokens[3]));
		   		this.recipeList.add(temp);
		   		s.close();
		    }
		    br.close();
	}
	
	public void removeRecipe(Recipe recipe){
		recipeList.remove(recipeList.indexOf(recipe));
	}
	
	//Helper methods
	private double convertStringToDouble(String str){
		double toReturn = Double.parseDouble(str);
		return toReturn;
	}
	
	private int convertStringToInt(String str){
		int toReturn = Integer.parseInt(str);
		return toReturn;
	}
}
