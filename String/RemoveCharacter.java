package String; // Package declaration. Ensure this matches the directory structure.

public class RemoveCharacter {
    public static void main(String[] args) {
        // Sample input string and character to remove
        String input = "Hello, World!";
        char removeChar = 'o';
        
        // Call the method to remove the specified character from the input string
        String result = removeCharacter(input, removeChar);

        // Output the original string
        System.out.println("Original: " + input);
        // Output the string after removing the specified character
        System.out.println("After removing '" + removeChar + "': " + result);
    }

    // Method to remove all occurrences of a specified character from a given string
    public static String removeCharacter(String str, char ch) {
        // Use a StringBuilder to build the result string without the specified character
        StringBuilder result = new StringBuilder();
        
        // Iterate over each character in the input string
        for (int i = 0; i < str.length(); i++) {
            // If the current character is not the one to remove, append it to the result
            if (str.charAt(i) != ch) {
                result.append(str.charAt(i));
            }
        }
        
        // Convert StringBuilder to String and return the result
        return result.toString();
    }
}
