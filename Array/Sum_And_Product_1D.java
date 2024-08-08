package Array; // Package declaration

import java.util.*; // Importing necessary utilities

public class Sum_And_Product_1D { // Class declaration

    // Aim: This program calculates the sum and product of all elements in a 1D array.
    
    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Scanner object to take input from user
        
        // Prompting user to enter the size of the array
        System.out.println("Enter the array size: ");
        int size = sc.nextInt(); // Reading the size of the array
        
        // Prompting user to enter the elements of the array
        System.out.println("Enter the elements:");
        int arr[] = new int[size]; // Declaring an array of the specified size
        
        int sum = 0; // Initializing sum to 0
        int prod = 1; // Initializing product to 1
        
        // Loop to take input for array elements and calculate sum and product
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); // Storing each element in the array
            sum += arr[i]; // Adding each element to sum
            prod *= arr[i]; // Multiplying each element to product
        }
        
        // Displaying the sum and product of array elements
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + prod);
    }
}
