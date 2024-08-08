package Array;

public class FindPosition {

    // Aim: This program searches for a specific element in a one-dimensional array 
    // and prints the position of the first occurrence of that element. 
    // If the element is not found, it informs the user.

    public static void main(String[] args) {

        // Initialize the array with given elements
        int arr[] = {1, 9, 7, 4, 8, 9, 10};

        // Element to find in the array
        int findPosition = 9;

        // A flag to track whether the element is found
        boolean flag = true;

        // Iterate through the array
        for(int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target element
            if(findPosition == arr[i]) {
                // If found, print the position (1-based index)
                System.out.println("Element Found In Position: " + (i + 1));
                // Set the flag to false and exit the loop
                flag = false;
                break;
            }
        }

        // If the element was not found, print a message
        if(flag) {
            System.out.println("Element not found");
        }
    }
}
