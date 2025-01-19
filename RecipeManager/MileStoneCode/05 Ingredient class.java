// *** Fixme: Remove for submission
import java.util.Scanner;

public class Ingredient {
    // Attributes of the Ingredient class
    private String name; // Name of the ingredient
    private double amount; // Amount of the ingredient
    private String unitOfMeasure; // Unit of measure for the ingredient
    private int calories; // Calories in the ingredient

    // Constructor to initialize the Ingredient object
    public Ingredient(String name, double amount, String unitOfMeasure, int calories) {
        this.name = name;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
        this.calories = calories;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for amount
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getter and Setter methods for unitOfMeasure
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    // Getter and Setter methods for calories
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    // Method to validate the data type of user input
    public static boolean isValidNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Method to display the ingredient details
    public void displayIngredient() {
        System.out.println("Ingredient: " + name);
        System.out.println("Amount: " + amount + " " + unitOfMeasure);
        System.out.println("Calories: " + calories);
    }

    // *** Fixme: Remove for submission

    public static void main(String[] args) {
        // // Example usage
        // Ingredient sugar = new Ingredient("Sugar", 1.5, "cups", 774);
        // sugar.displayIngredient();
    Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.print("Enter ingredient name (or type 'exit' to quit): ");
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("exit")) {
        break;
        }

        System.out.print("Enter amount: ");
        String amountStr = scanner.nextLine();
        while (!isValidNumber(amountStr)) {
        System.out.print("Invalid input. Enter a valid amount: ");
        amountStr = scanner.nextLine();
        }
        double amount = Double.parseDouble(amountStr);

        System.out.print("Enter unit of measure: ");
        String unitOfMeasure = scanner.nextLine();

        System.out.print("Enter calories: ");
        String caloriesStr = scanner.nextLine();
        while (!isValidNumber(caloriesStr)) {
        System.out.print("Invalid input. Enter a valid number of calories: ");
        caloriesStr = scanner.nextLine();
        }
        int calories = Integer.parseInt(caloriesStr);

        Ingredient ingredient = new Ingredient(name, amount, unitOfMeasure, calories);
        ingredient.displayIngredient();
    }
    scanner.close();
    }
}