package Array;

public class Array_Is_Sorted_Or_Not {

    // Aim: This program aims to check if a given array of integers is sorted in ascending order and print the result.

    public static void main(String[] args) {
        // Initialize an array of integers with predefined values
        int arr[] = {1, 2, 4, 23, 21, 29};
        
        // Initialize a boolean variable to store whether the array is sorted
        boolean isSorted = true;
        
        // Loop through the array to check if each element is less than or equal to the next element
        for(int i = 0 ; i < arr.length - 1 ; i++) {
            // If the current element is greater than the next element, set isSorted to false and break the loop
            if(arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        
        // Print the result based on the value of isSorted
        if(isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
