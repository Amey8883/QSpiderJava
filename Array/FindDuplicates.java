package Array_Revision;

public class FindDuplicates {

    public static void main(String[] args) {
        // Aim: To find and display duplicate elements from an array.

        int arr[] = {2, 3, 4, 2, 7, 8, 8};  // Input array with possible duplicates

        System.out.println("Duplicate elements:");

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Compare the current element with the rest of the elements
            for (int j = i + 1; j < arr.length; j++) {
                // If a duplicate is found, print it
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + "  ");  // Print the duplicate element
                    break;  // Stop checking further once a duplicate is found for this element
                }
            }
        }
    }
}
