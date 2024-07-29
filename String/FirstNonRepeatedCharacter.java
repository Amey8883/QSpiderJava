v    // Sample Input:
    // str = "swiss"
    //
    // Sample Output:
    // "First non-repeated character: w"
    
    // This program finds the first non-repeated character in a string.
    // A non-repeated character is a character that appears only once in the string.
    // For example, in the string "swiss", the first non-repeated character is 'w'.    // Sample Input:
    // str = "swiss"
    //
    // Sample Output:
    // "First non-repeated character: w"
    
    // This program finds the first non-repeated character in a string.
    // A non-repeated character is a character that appears only once in the string.
    // For example, in the string "swiss", the first non-repeated character is 'w'.

package String;

public class FirstNonRepeatedCharacter {
    
    public static void main(String[] args) {
        String str = "swiss";
        boolean flag = false;
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean repeated = false;
            
            // Check if the current character is repeated in the string
            for (int j = 0; j < str.length(); j++) {
                if (i != j && ch == str.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            
            // If the character is not repeated, print it and set flag to true
            if (!repeated) {
                System.out.println("First non-repeated character: " + ch);
                flag = true;
                break;
            }
        }
        
        // If no non-repeated character is found, print a message
        if (!flag) {
            System.out.println("No non-repeated character found");
        }
    }
}
