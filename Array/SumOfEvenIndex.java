package Array;

public class SumOfEvenIndex {

    // Aim: This program aims to calculate and display the sum of elements at even indices in a given integer array.

    public static void main(String[] args) {
        // Initialize an array of integers with predefined values
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // Calculate the sum of elements at even indices
        int sum = sumOfEvenIndexElements(arr);
        
        // Print the calculated sum
        System.out.println(sum);
    }
    
    public static int sumOfEvenIndexElements(int[] arr) {
        // Initialize a variable to store the sum
        int sum = 0;
        
        // Loop through the array with a step of 2 to access even indices
        for (int i = 0; i < arr.length; i += 2) {
            // Add the element at the current even index to the sum
            sum += arr[i];
        }
        
        // Return the calculated sum
        return sum;
    }
}
