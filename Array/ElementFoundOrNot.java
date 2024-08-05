//The code checks whether a specific float value is present in an array of float values and prints a message indicating whether the value is found or not.

// Define the package name
package Array;

// Define the public class ElementFoundOrNot
public class ElementFoundOrNot {

    // Main method: the entry point of the program
    public static void main(String[] args) {

        // Initialize an array of float values with predefined elements
        float arr[] = {76.7f, 34.3f, 57.5f, 98.9f, 100.0f, 65.6f};

        // Initialize the value to be found in the array
        float found = 98.9f;

        // Initialize a boolean flag to false (indicates whether the value is found)
        boolean flag = false;

        // Iterate through each element in the array
        for (float element : arr) {
            // Check if the current element matches the value to be found
            if (element == found) {
                // Set the flag to true if the value is found
                flag = true;
                // Exit the loop as the value has been found
                break;
            }
        }

        // Check the flag to determine if the value was found in the array
        if (flag) {
            // Print a message indicating that the value is present in the array
            System.out.println("The value is Present in the Array: " + found);
        } else {
            // Print a message indicating that the value is not present in the array
            System.out.println("The value is not Present in the Array: " + found);
        }
    }
}
