package Array_Revision;

public class FrequencyOfElements {

    public static void main(String[] args) {
        // Aim: To find and display the frequency of each element in an array.

        int arr[] = {1, 2, 2, 3, 4, 4, 4};  // Input array with elements

        int freq[] = new int[arr.length];  // Array to store frequencies of elements

        int visited = -1;  // Marking value for elements already counted

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            int count = 1;  // Initialize count for the current element

            // Loop through the rest of the array to find duplicates
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;  // Increment count for each duplicate
                    freq[j] = visited;  // Mark the duplicate element as visited
                }
            }

            // If the current element is not marked as visited, store its count
            if (freq[i] != visited) {
                freq[i] = count;  // Store the frequency of the element
            }
        }

        // Output the frequency of each element
        System.out.println("Element | Frequency");
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] != visited) {  // Print only unvisited elements
                System.out.println("    " + arr[i] + "   |   " + freq[i]);  // Print element and its frequency
            }
        }
    }
}
