package String;

public class RotationCheck {

    public static void main(String[] args) {
        // Sample input strings
        String str1 = "ABCD";  // First string
        String str2 = "CDAB";  // Second string to check if it's a rotation of the first string

        // Check if str2 is a rotation of str1
        if (isRotation(str1, str2)) {
            // If true, print that the strings are rotations of each other
            System.out.println(str1 + " and " + str2 + " are rotations of each other");
        } else {
            // If false, print that the strings are not rotations of each other
            System.out.println(str1 + " and " + str2 + " are not rotations of each other");
        }
    }

    // Method to check if str2 is a rotation of str1
    public static boolean isRotation(String str1, String str2) {
        // If lengths are not equal, str2 cannot be a rotation of str1
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself to create a string that contains all possible rotations of str1
        String concatenated = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenated.contains(str2);
    }
}
