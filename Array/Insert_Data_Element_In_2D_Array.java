package Array;

import java.util.Scanner;

public class Insert_Data_Element_In_2D_Array {

    // Aim: This program allows the user to create a 2D array of integers with a specified number of rows and columns,
    // and then populate it with user-provided values. Finally, it prints the 2D array to the console.

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Enter the Number of rows: ");
        int rows = sc.nextInt();

        // Prompt the user to enter the number of columns
        System.out.print("Enter the Number of columns: ");
        int cols = sc.nextInt();

        // Initialize a 2D array with the specified number of rows and columns
        int[][] arr = new int[rows][cols];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        
        // Iterate through each row
        for(int i = 0; i < rows; i++) {
            // Iterate through each column within the current row
            for(int j = 0; j < cols; j++) {
                // Store the user input in the current cell of the array
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("The 2D array is: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                // Print each element followed by a space
                System.out.print(arr[i][j] + " ");
            }
            // Move to the next line after printing all columns in a row
            System.out.println();
        }
        
        // Close the Scanner object to prevent resource leaks
        sc.close();
    }
}
