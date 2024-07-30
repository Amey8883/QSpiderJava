package String;

public class Palindrome_String {

    public static void main(String[] args) {
        // Sample input string to check if it is a palindrome
        String str = "naman";
        
        // Variable to store the reversed string
        String rev = "";
        
        // Loop to reverse the input string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i); // Append each character from the end to the beginning
        }
        
        // Check if the original string is equal to the reversed string
        if (str.equals(rev)) {
            // If they are equal, the string is a palindrome
            System.out.println("String is Palindrome");
        } else {
            // If they are not equal, the string is not a palindrome
            System.out.println("String is not Palindrome");
        }
    }
}
