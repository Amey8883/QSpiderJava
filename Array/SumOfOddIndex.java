package Array;

public class SumOfOddIndex {

    // Aim: This program aims to find and display the sum of elements at odd indices in a given integer array.

    public static void main(String[] args) {
        // Initialize an array of integers with predefined values
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // Call the function to calculate the sum of elements at odd indices and store the result in sum
        int sum = sumOfOddIndexElements(arr);
        
        // Print the sum of elements at odd indices
        System.out.println(sum);
    }
    
    // Function to calculate the sum of elements at odd indices
    public static int sumOfOddIndexElements(int arr[]) {
        // Initialize sum to 0
        int sum = 0;
        
        // Loop through the array, starting from index 1 and incrementing by 2 to access odd indices
        for(int i = 1; i < arr.length; i += 2) {
            // Add the element at the current odd index to the sum
            sum += arr[i];
        }
        
        // Return the calculated sum
        return sum;
    }
}
