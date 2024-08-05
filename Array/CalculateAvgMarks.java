//The code calculates and prints the average of an array of float values representing marks.

// Define the package name
package Array;

// Define the public class CalculateAvgMarks
public class CalculateAvgMarks {

    // Main method: the entry point of the program
    public static void main(String[] args) {

        // Initialize an array of float values with predefined elements representing marks
        float marks[] = {34.3f, 21.1f, 65.2f, 87.9f, 76.8f};

        // Initialize a variable to store the sum of the elements
        float sum = 0;

        // Iterate through each element in the array
        for (float element : marks) {
            // Add the value of the current element to the sum
            sum += element;
        }

        // Calculate the average by dividing the sum by the number of elements in the array
        float average = sum / marks.length;

        // Print the average of the marks
        System.out.println("The value of average marks is: " + average);
    }
}
