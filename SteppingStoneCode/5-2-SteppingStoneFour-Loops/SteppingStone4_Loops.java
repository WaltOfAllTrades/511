package SteppingStones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;


public class SteppingStone4_Loops {
    
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
       String recipeName = "";
       ArrayList<String> ingredientList = new ArrayList();
       String newIngredient = "";
       boolean addMoreIngredients = true;
       
       System.out.println("Please enter the recipe name: ");
       recipeName = scnr.nextLine();
       
        
       do {           
           System.out.println("Would you like to enter an ingredient: (y or n)");
           String reply = scnr.next().toLowerCase();
           
           /**
            * Add your code here (branches work well!).  The code should check the
            * reply:
            *   "y" --> prompt for the ingredient and add it to the ingredient list;
            *   "n" --> break out of the loop;
            *   anything else --> prompt for a "y" or "n"
            * 
            */

            // If user inputs "y" then prompt for ingredient and add it to the ingredient list
            // Else if, user inputs "n" then break out of the loop by assigning false to addMoreIngredients
            // Else, Prompt user for "y" or "n"
             if (reply.equals("y")) {
                 System.out.println("Please enter the ingredient: ");
                 newIngredient = scnr.nextLine(); // Using nextLine() instead of next() to capture ingredients with spaces such as "cheddar cheese"
                 ingredientList.add(newIngredient); // FIXME review the method to add an item to the list based on array lesson
             } else if (reply.equals("n")) { 
                 addMoreIngredients = false;
             } else { 
                 System.out.println("Please reply with 'y' or 'n'");
             }
            
       } while (addMoreIngredients);

       // 
    for (int i = 0; i < ingredientList.size(); i++) {
        /**
           * Get the item i from the ingredient list
           *	and assigning it to the String ingredient
           *
           */
           String ingredient = ingredientList.get(i); // FIXME review the method to get an item from the list based on array lesson
        System.out.println(ingredient);
    }
    }
}



