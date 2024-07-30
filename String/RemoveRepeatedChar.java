package String;

public class RemoveRepeatedChar {

    public static void main(String[] args) {
        // Define the input string with repeated characters
        String str = "Ramanandan";
        
        // Initialize an empty string to store the result without repeated characters
        String result = "";
        
        // Iterate over each character in the input string
        for(int i = 0 ; i < str.length() ; i++) {
            // Get the current character at position i
            char currentChar = str.charAt(i);
            
            // Check if the current character is not already in the result string
            if(result.indexOf(currentChar) == -1) {
                // If not, append the character to the result string
                result += currentChar;
            }
        }
        
        // Print the result after removing repeated characters
        System.out.println("Repeated character removed: " + result);
    }
}

/*
Sample Input: "Ramanandan"
Sample Output: "Ramandn"

Explanation:
The program removes repeated characters from the input string.
1. It iterates through each character of the input string "Ramanandan".
2. For each character, it checks if it is already present in the result string.
3. If the character is not found in the result string (i.e., it's the first occurrence), it appends it to the result string.
4. The final result string contains only the first occurrence of each character from the input, with all duplicates removed.
*/
