package Array;

public class ReverseArray {

    public static void main(String[] args) {

        // Initialize the array with elements
        int[] arr = {1, 2, 3, 4, 5, 6}; 

        // Temporary variable for swapping elements
        int temp;

        // Length of the array
        int l = arr.length;

        // Calculate the midpoint of the array
        int n = Math.floorDiv(l, 2);

        // Loop through the first half of the array
        for (int i = 0; i < n; i++) {
            // Swap the elements at index i and l - i - 1
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }

        // Print the reversed array
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
