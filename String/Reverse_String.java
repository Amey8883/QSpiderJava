package String; // Package declaration. Ensure this matches the directory structure.

public class Reverse_String {

    public static void main(String[] args) {
        // Define the input string to be reversed
        String str = "Deshpande"; // Sample input string

        // Initialize an empty string to store the reversed result
        String rev = "";

        // Loop through the input string from the end to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            // Append each character to the 'rev' string
            rev += str.charAt(i);
        }

        // Output the reversed string to the console
        System.out.println(rev); // Sample output for input "Deshpande" will be "ednahpseD"
    }
}
