package Array; // Package declaration

import java.util.Scanner; // Importing the Scanner class for user input

public class Sum_And_Product_Array_2D { // Class declaration

    // Aim: This program calculates the sum and product of all elements in a 2D array.

    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Scanner object to take input from user
        
        // Prompting user to enter the number of rows in the 2D array
        System.out.println("Enter the rows: ");
        int rows = sc.nextInt(); // Reading the number of rows
        
        // Prompting user to enter the number of columns in the 2D array
        System.out.println("Enter the columns: ");
        int cols = sc.nextInt(); // Reading the number of columns
        
        // Prompting user to enter the elements of the 2D array
        System.out.println("Enter the elements of the array: ");
        int[][] arr = new int[rows][cols]; // Declaring a 2D array with the specified rows and columns
        
        // Nested loop to input elements into the 2D array
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt(); // Storing each element in the 2D array
            }
        }
        
        int sum = 0; // Initializing sum to 0
        int prod = 1; // Initializing product to 1
        
        // Nested loop to calculate the sum and product of the 2D array elements
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum += arr[i][j]; // Adding each element to sum
                prod *= arr[i][j]; // Multiplying each element to product
            }
        }
        
        // Displaying the sum and product of the 2D array elements
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Product of the elements: " + prod);    
    }
}
