package String;

import java.util.Scanner;

public class ManipulateString {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter the String: ");
        // Read the input string and convert it to lowercase
        String str = sc.next().toLowerCase();
        
        // Initialize an empty string to build the manipulated string
        String newStr = "";
        
        // Iterate over each character in the original string
        for (int i = 0; i < str.length(); i++) {
            // If the index is even, convert the character to uppercase
            if (i % 2 == 0) {
                newStr = newStr + str.substring(i, i + 1).toUpperCase();
            } 
            // If the index is odd, convert the character to lowercase
            else {
                newStr = newStr + str.substring(i, i + 1).toLowerCase();
            }
        }
        
        // Print the original string
        System.out.println("Before: " + str);
        // Print the manipulated string
        System.out.println("After: " + newStr);
    }
}
