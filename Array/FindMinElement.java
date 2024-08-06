package Array;

public class FindMinElement {

    // Aim: This program aims to find and display the minimum element in a given integer array.

    public static void main(String[] args) {
        // Initialize an array of integers with predefined values
        int arr[] = {1, 2700, 3, 450, 5, 34, 76};
        
        // Initialize a variable to store the minimum value found, starting with the first element of the array
        int min = arr[0];
        
        // Loop through each element in the array
        for(int element : arr) {
            // If the current element is less than the current minimum, update the minimum
            if(element < min) {
                min = element;
            }
        }
        
        // Print the minimum element found in the array
        System.out.println("The value of the Minimum element in this array: " + min);
    }
}
