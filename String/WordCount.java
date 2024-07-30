package String; // Package declaration. Ensure this matches the directory structure.

public class WordCount {

    public static void main(String[] args) {
        // Define the input string for which we want to count the number of words
        String input = "Hello , this is a sample string";
        
        // Call the method to count the number of words in the input string
        int wordCount = countWords(input);
        
        // Output the result to the console
        System.out.println("Number of words: " + wordCount);
        // Sample Output: Number of words: 6
        // Explanation: The string "Hello , this is a sample string" contains 6 words.
    }

    // Method to count the number of words in a given string
    public static int countWords(String str) {
        // Trim leading and trailing whitespace from the string, then split it into words based on whitespace
        String[] words = str.trim().split("\\s+");
        
        // Return the number of words found
        return words.length;
    }
}
