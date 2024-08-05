//The code calculates and prints the sum of an array of float values.

// Define the package name
package Array;

// Define the public class SumOfFloats
public class SumOfFloats {

    // Main method: the entry point of the program
    public static void main(String[] args) {

        // Initialize an array of float values with predefined elements
        float marks[] = {34.3f, 21.1f, 65.2f, 87.9f, 76.8f};

        // Initialize a variable to store the sum of the elements
        float sum = 0;

        // Iterate through each element in the array
        for (float element : marks) {
            // Add the value of the current element to the sum
            sum += element;
        }

        // Print the total sum of the elements in the array
        System.out.println("The value of sum is: " + sum);
    }
}
