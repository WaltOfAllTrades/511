/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SteppingStones;

import java.util.Scanner;

public class SteppingStone2_IngredientCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       // Initialize variables with appropriate data type and value
       String nameOfIngredient = "";
       double numberCups = 0.0;
       int numberCaloriesPerCup = 0;
       double totalCalories = 0.0;
       
       // Read ingredient data from user
       Scanner scnr = new Scanner(System.in);
       
       System.out.println("Please enter the name of the ingredient: ");
       nameOfIngredient = scnr.next();
       
       System.out.println("Please enter the number of cups of " 
        + nameOfIngredient + " we'll need: ");
       numberCups = scnr.nextFloat();
       
       System.out.println("Please enter the name of calories per cup: ");
       numberCaloriesPerCup = scnr.nextInt();
       
       // Calculate totalCalories by multiplying the number of cups by calories per cup
       totalCalories = numberCups * numberCaloriesPerCup;

       // Print out ingredient data
       System.out.println(nameOfIngredient + " uses " + numberCups 
       + " cups and has " + totalCalories + " calories.");
       
    }
    
}

/**
 * 
 * Final Project
 *
 *For your Final Project:
 *
 * 1. Create a new java class named Ingredient
 * 
 * 2. Adapt the code from this SteppingStone to include the following changes:
 *
 *   a. Rename the variable, numberCups, to represent the more general 
 *      ingredientAmount;
 *
 *   b. Add a new text variable, unitMeasurement to store unit of measurement
 *      for the ingredient amount (e.g. cups, oz., etc.);
 *
 *   c. Prompt the user to input the measurement unit;
 * 
 * /

