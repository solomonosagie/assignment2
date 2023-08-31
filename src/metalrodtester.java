/* Assesment: assignment 2
 * student: Solomon Osagie
 * due date : July 28 2023
 * Description  :  creating a program to  check if a rod is within tolerance range  
 * professor :Veda Vasavi Erukulla
 */


import java.util.Scanner;

public class MetalRodTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a new Scanner object to read input from the keyboard (System.in)
        int rodsWithinTolerance = 0; // Initialize the counter for rods within tolerance
        int totalRods = 0; // Initialize the counter for the total number of rods entered
        String input = ""; // Initialize a variable to store the user's input

        do {
            // Prompt the user to enter the length of the rod in cm
            System.out.print("Please enter the length of the rod in cm: ");
            
            while (!scanner.hasNextDouble()) { // Loop to handle non-numeric inputs
                System.out.println("Please enter a numerical value"); // Inform the user to enter a numerical value
                scanner.nextLine(); // Clear the input buffer to avoid an infinite loop.
            }

            double length = scanner.nextDouble(); // Read the next double entered by the user
            MetalRod metalrod = new MetalRod(length); // Create a new MetalRod object with the entered length
            totalRods++; // Increment the total number of rods entered by 1
            
            // Check if the metal rod is within the tolerance range and provide appropriate feedback to the user
            if (metalrod.rodIsWithinTolerance()) {
                rodsWithinTolerance++; // Increment the counter for rods within tolerance by 1
                System.out.println("This rod is within tolerance.");
            } else {
                System.out.println("This rod is not within tolerance.");
            }
            
            // Calculate the percentage of rods within tolerance and display it
            double percentageWithinTolerance = (double) rodsWithinTolerance / totalRods * 100;
            System.out.printf("%.0f%% of rods entered so far have been within tolerance%n", percentageWithinTolerance);
            
            // Ask the user if they wish to continue checking rod lengths
            System.out.print("Do you wish to continue? (y/n): ");
            input = scanner.next(); // Read the next input from the user
            scanner.nextLine(); // Clear the input buffer to avoid any issues with the next iteration
        } while (input.equalsIgnoreCase("y")); // Continue the loop if the user enters 'y' or 'Y'
        
        System.out.println("Goodbye."); // Output "Goodbye" when the user chooses to stop the program
        scanner.close(); // Close the Scanner object to release resources
    }
}