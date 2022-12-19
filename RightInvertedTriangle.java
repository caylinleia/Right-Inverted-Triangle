import java.util.Scanner;

/**
 * Caylin Leia (Student ID: 261125917)
 */

public class RightInvertedTriangle {
    /**
     * This program will have a size input
     * and will determine print out an inverted right triangle
     * that is greater than the size of 0
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner used to obtain the input of the size of the triangle
        System.out.println("Enter Size of Triangle: "); // Prints a prompt for the user to input a size
        int size = scan.nextInt(); // Integer used to return the size of the triangle
        if(size >= 0) { // Verifying to determine if the size of the triangle is >= 0
            printRightInvertedTriangle(size); // Prints the inverted right triangle according to the size that was inputted
        } else {
            System.out.println("Error: Input value must be >= 0"); // Prints an error message if the size of the triangle is not >= 0
        }
        scan.close(); // Closes and ends the scanner
    }
    // Method to print an inverted right triangle
    public static void printRightInvertedTriangle(int x) {
        for(int i = 1; i <= x; i++) { // Loop used to determine how many columns will be used for the triangle
            for(int j = 1; j <= x; j++) { // Nested loop used to determine how many rows will be used for the triangle
                if (j < i) { // Verifying to determine what how many spaces to print in order to create the shape and size of the triangle
                    System.out.print(" "); // Prints the exact amount of spaces in accordance to the inputted size of the triangle
                } else {
                    System.out.print("*"); // Prints the exact amount of stars in accordance to the inputted size of the triangle
                }
            }
            System.out.println(); // Proceeds to move on to the next row to continue printing the remainder of the triangle
        }
    }
}