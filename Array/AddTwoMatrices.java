//The code adds two 2D matrices and stores the result in a third matrix.

// Define the package name
package Array;

// Define the public class AddTwoMatrices
public class AddTwoMatrices {

    // Main method: the entry point of the program
    public static void main(String[] args) {

        // Initialize the first 2D matrix with predefined values
        int mat1[][] = { 
            {1, 2, 3},
            {4, 5, 6} 
        };

        // Initialize the second 2D matrix with predefined values
        int mat2[][] = { 
            {7, 8, 9},
            {10, 11, 12} 
        };

        // Initialize the result 2D matrix with zeros
        int result[][] = { 
            {0, 0, 0},
            {0, 0, 0} 
        };

        // Iterate through each element of the matrices by rows
        for (int i = 0; i < mat1.length; i++) {
            // Iterate through each element of the matrices by columns
            for (int j = 0; j < mat1[i].length; j++) {
                // Print the current indices being processed
                System.out.format("Setting value for i=%d and j=%d\n", i, j);

                // Add corresponding elements of mat1 and mat2 and store the result
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Print the result matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();  // Newline for next row
        }
    }
}
