package String;

public class VowelConsonantCount {

    public static void main(String[] args) {
        // Sample input string
        String str = "My name is Amey";
        
        // Initialize counters for vowels and consonants
        int vowels = 0;
        int consonant = 0;

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Convert the current character to lowercase to handle case insensitivity
            char ch = Character.toLowerCase(str.charAt(i));
            
            // Check if the character is a letter (between 'a' and 'z')
            if (ch >= 'a' && ch <= 'z') {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++; // Increment vowel count
                } else {
                    consonant++; // Increment consonant count
                }
            }
        }

        // Print the counts of vowels and consonants
        System.out.println("Count of Vowels: " + vowels); // Output for sample input: 4
        System.out.println("Count of Consonant: " + consonant); // Output for sample input: 7
    }
}
