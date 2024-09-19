package Array_Revision;

public class SumEvenOdd {

    public static void main(String[] args) {
        // Aim: To calculate the sum of even and odd numbers in the array.

        int arr[] = {1, 2, 3, 4, 5};  // Input array of integers

        int evenSum = 0;  // Variable to hold the sum of even numbers
        int oddSum = 0;   // Variable to hold the sum of odd numbers

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is even
            if (arr[i] % 2 == 0) {
                evenSum += arr[i];  // Add to evenSum if the number is even
            } else {
                oddSum += arr[i];    // Add to oddSum if the number is odd
            }
        }

        // Output the results
        System.out.println("Even number Sum: " + evenSum);  // Print the sum of even numbers
        System.out.println("Odd number Sum: " + oddSum);    // Print the sum of odd numbers
    }
}
