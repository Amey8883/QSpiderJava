package Array_Revision;

import java.util.Arrays;

public class LeftRotateArray {

    public static void main(String[] args) {
        // Aim: To left rotate the array by one position.

        int arr[] = {1, 2, 3, 4, 5};  // Input array

        // Display the array before rotation
        System.out.println("Array before rotation: " + Arrays.toString(arr));

        // Store the first element because it will be moved to the last position
        int firstElement = arr[0];  

        // Shift each element of the array one position to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];  // Move each element one position to the left
        }

        // Assign the first element to the last position
        arr[arr.length - 1] = firstElement;

        // Display the array after the left rotation
        System.out.println("Array after left rotation: " + Arrays.toString(arr));
    }
}
