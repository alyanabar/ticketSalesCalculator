/**
 * @author [Alyana Barrera]
 * CS1180, Summer 2020
 * Project 1
 */

import java.util.Scanner;
/**
 * This program will provide experience using input and output statements 
 * and performing net revenue calculations from basketball ticket sales.
 */

class Main {
  /**
 * Prompts the user to enter the name of purchaser, number of adult tickets, 
 * number of student tickets, and if user is a book club member
 * @param args 
 */
  public static void main(String[] args) {
    //Declare constants for any known values
        final double ADULT_COST = 29.00;
        final double STUDENT_COST = 14.50;
        final double DISCOUNT_PERCENT = 0.10;
        
        //Declare variables for all input values and all calculated values
        String name;
        String bonusClubStatus;
        int numOfAdult;
        int numOfStudent;
        double totalCost;
        double discount;
        double purchasePrice;
        
        //Get input from user (name of purchaser, number of adult tickets sold, number of student tickets sold, is user a member of the "bonus club")
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.print("Please enter the number of adult tickets you are purchasing: ");
        numOfAdult = keyboard.nextInt();
        System.out.print("Please enter the number of student tickets you are purchasing: ");
        numOfStudent = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Are you a member of the Bonus Club (Y/N)? ");
        bonusClubStatus = keyboard.nextLine();
        System.out.println();
        System.out.println("Summary of purchase for " + name + ":");
        System.out.println("Number of adult tickets purchased: " + numOfAdult);
        System.out.println("Number of student tickets purchased: " + numOfStudent);
        System.out.println();
        
        //Calculate total cost (explained below)
        totalCost = (numOfAdult * ADULT_COST) + (numOfStudent * STUDENT_COST);
        System.out.printf("Total Cost: $%.2f", totalCost);
        System.out.println();
        
        //Calculate discount (explained below)
        discount = totalCost * DISCOUNT_PERCENT;
        if (bonusClubStatus.equalsIgnoreCase("Y"))
        {
            System.out.printf("Discount: $%.2f\n", discount);
        }
        else if (bonusClubStatus.equalsIgnoreCase("N"))
        {
            System.out.println("Discount: $0.00 - Join our Bounus Club to receive dicsounts on future purchases!");
        }
        
        //Calculate purchase price (explained below)
        purchasePrice = totalCost - discount;
        if (bonusClubStatus.equalsIgnoreCase("Y")) 
        {
            System.out.printf("Purchase Price: $%.2f\n", purchasePrice);
        }
        if (bonusClubStatus.equalsIgnoreCase("N")) 
        {
            System.out.printf("Purchase Price: $%.2f\n", totalCost);
        }
  }
}