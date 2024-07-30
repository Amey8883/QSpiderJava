package String;

public class CapitalizeFirstLetter {

    // Sample Input:
    // input = "hello, this is the sample string"
    //
    // Sample Output:
    // "Hello, This Is The Sample String"

    // This program capitalizes the first letter of each word in a given string.
    // It splits the string into words, capitalizes the first letter of each word,
    // and then joins them back into a single string.
    
    public static void main(String[] args) {
        String input = "hello, this is the sample string";
        String result = capitalizeFirstLetterOfEachWord(input);
        System.out.println("Original: " + input);
        System.out.println("Capitalized: " + result);
    }
    
    // Method to capitalize the first letter of each word
    public static String capitalizeFirstLetterOfEachWord(String str) {
        // Split the input string into words
        String[] words = str.split(" ");
        StringBuilder capitalized = new StringBuilder();
        
        // Iterate over each word
        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize the first letter and append the rest of the word
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1))
                           .append(" ");
            }
        }
        
        // Return the capitalized string, trimmed to remove trailing spaces
        return capitalized.toString().trim();
    }
}
