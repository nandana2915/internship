

import java.util.Scanner;

public class Pizzastore 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean ordering = true;

        while (ordering) 
        
        {
            displayMenu();

            
            String pizzaType = selectPizza(scanner);
            String vegNonVeg = selectVegNonVeg(scanner);

           
            boolean extraCheese = selectExtraCheese(scanner);
            boolean extraToppings = selectExtraToppings(scanner);

            
            String diningOption = selectDiningOption(scanner);

            
            double totalBill = calculateBill(pizzaType, vegNonVeg, extraCheese, extraToppings, diningOption);
            displayBill(pizzaType, vegNonVeg, extraCheese, extraToppings, diningOption, totalBill);

            System.out.print("\nWould you like to order another pizza? (yes/no): ");
            String again = scanner.next().toLowerCase();
            if (!again.equals("yes")) 
            {
                ordering = false;
                System.out.println("Thank you for visiting the Pizza Store!");
            }
        }

        scanner.close();
    }

    public static void displayMenu() 
    {
        System.out.println("Welcome to the Pizza Store!");
        System.out.println("1. Base Pizza");
        System.out.println("2. Deluxe Pizza");
        System.out.println("3. Exit");
    }

    public static String selectPizza(Scanner scanner) 
    {
        while (true) 
        {
            System.out.print("Please select the type of pizza (1 for Base, 2 for Deluxe): ");
            int choice = scanner.nextInt();
            if (choice == 1) 
            {
                return "Base";
            } else if (choice == 2) 
            {
                return "Deluxe";
            } else 
            {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static String selectVegNonVeg(Scanner scanner) 
    {
        while (true) 
        {
            System.out.print("Do you want Veg or Non-Veg pizza? (1 for Veg, 2 for Non-Veg): ");
            int choice = scanner.nextInt();
            if (choice == 1) 
            {
                return "Veg";
            } else if (choice == 2) 
            {
                return "Non-Veg";
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static boolean selectExtraCheese(Scanner scanner) 
    {
        System.out.print("Would you like extra cheese? (yes/no): ");
        String choice = scanner.next().toLowerCase();
        return choice.equals("yes");
    }

    public static boolean selectExtraToppings(Scanner scanner) 
    {
        System.out.print("Would you like extra toppings? (yes/no): ");
        String choice = scanner.next().toLowerCase();
        return choice.equals("yes");
    }

    public static String selectDiningOption(Scanner scanner) 
    {
        while (true) 
        {
            System.out.print("Would you like to take away or dine in? (1 for Take Away, 2 for Dine In): ");
            int choice = scanner.nextInt();
            if (choice == 1) 
            {
                return "Take Away";
            } else if (choice == 2) 
            {
                return "Dine In";
            } else 
            {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static double calculateBill(String pizzaType, String vegNonVeg, boolean extraCheese, boolean extraToppings, String diningOption) 
    {
    
        double basePrice = pizzaType.equals("Base") ? 100 : 150;
        double vegNonVegPrice = vegNonVeg.equals("Veg") ? 75 : 50;
        double cheesePrice = extraCheese ? 20 : 0;
        double toppingsPrice = extraToppings ? 30 : 0;
        double diningCharge = diningOption.equals("Dine In") ? 20 : 0;

    
        return basePrice + vegNonVegPrice + cheesePrice + toppingsPrice + diningCharge;
    }

    public static void displayBill(String pizzaType, String vegNonVeg, boolean extraCheese, boolean extraToppings, String diningOption, double totalBill) 
    {
        System.out.println("Your Order Summary:");

        System.out.println("Pizza Type: " + pizzaType + " (" + vegNonVeg + ")");
        
        if (extraCheese) 
        {
            System.out.println("Customization: Extra Cheese");
        }
        if (extraToppings) 
        {
            System.out.println("Customization: Extra Toppings");
        }

        System.out.println("Dining Option: " + diningOption);

        System.out.println("Total Bill: $" + totalBill);
    }
}
