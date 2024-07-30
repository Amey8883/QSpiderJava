package String;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        // Sample input string
        String input = "aabbbcccc";
        
        // Call the method to find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(input);

        // Output the result to the console
        System.out.println("Most frequent character: " + mostFrequentChar);
        // Sample Output: Most frequent character: c
        // Explanation: In the input string "aabbbcccc", the character 'c' appears most frequently (4 times).
    }

    // Method to find the most frequent character in a given string
    public static char findMostFrequentCharacter(String str) {
        // Array to store frequency of each character (assuming ASCII character set)
        int[] freq = new int[256];

        // Count the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Variables to track the maximum frequency and corresponding character
        int maxFreq = 0;
        char mostFrequentChar = ' ';

        // Find the character with the maximum frequency
        for (int i = 0; i < str.length(); i++) {
            // If the current character's frequency is greater than the maximum found so far
            if (freq[str.charAt(i)] > maxFreq) {
                // Update the maximum frequency and the most frequent character
                maxFreq = freq[str.charAt(i)];
                mostFrequentChar = str.charAt(i);
            }
        }

        // Return the most frequent character
        return mostFrequentChar;
    }
}
