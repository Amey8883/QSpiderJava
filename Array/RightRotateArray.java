package Array_Revision;

import java.util.Arrays;

public class RightRotateArray {

    public static void main(String[] args) {
        // Aim: To right rotate the array by one position.

        int arr[] = {1, 2, 3, 4, 5};  // Input array

        // Display the array before rotation
        System.out.println("Array before rotation: " + Arrays.toString(arr));

        // Store the last element because it will be moved to the front
        int lastElement = arr[arr.length - 1];

        // Shift each element of the array one position to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];  // Move each element one position to the right
        }

        // Assign the last element to the first position
        arr[0] = lastElement;

        // Display the array after the right rotation
        System.out.println("Array after right rotation: " + Arrays.toString(arr));
    }
}
