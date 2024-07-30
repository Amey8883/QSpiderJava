package String;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Sample input string with duplicate characters
        String str = "programming";
        
        // Use a StringBuilder to build the result string without duplicates
        StringBuilder result = new StringBuilder();
        
        // Iterate over each character in the input string
        for (int i = 0; i < str.length(); i++) {
            // Get the current character
            char ch = str.charAt(i);
            // Flag to indicate if the character is already in the result
            boolean flag = false;
            
            // Check if the character has already been added to the result
            for (int j = 0; j < i; j++) {
                if (ch == str.charAt(j)) {
                    flag = true; // Character is a duplicate
                    break; // Exit the inner loop
                }
            }
            
            // If the character is not a duplicate, add it to the result
            if (!flag) {
                result.append(ch);
            }
        }
        
        // Print the result string without duplicates
        System.out.println("Without duplicates: " + result.toString());
    }
}
