package String; // Package declaration. Ensure this matches the directory structure.

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        // Define the input string for which we want to find the longest palindromic substring
        String input = "babad";
        
        // Call the method to find the longest palindromic substring
        String longestPalindrome = findLongestPalindrome(input);

        // Output the result to the console
        System.out.println("Longest palindromic substring: " + longestPalindrome);
    }

    // Method to find the longest palindromic substring in a given string
    public static String findLongestPalindrome(String s) {
        // Check for edge cases: if the string is null or empty, return an empty string
        if (s == null || s.length() < 1) return "";
        
        // Initialize pointers to keep track of the start and end of the longest palindrome found
        int start = 0, end = 0;

        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Check for palindromes centered at the current character (odd-length palindromes)
            int len1 = expandAroundCenter(s, i, i);
            
            // Check for palindromes centered between the current character and the next one (even-length palindromes)
            int len2 = expandAroundCenter(s, i, i + 1);
            
            // Get the maximum length between the two types of palindromes
            int len = Math.max(len1, len2);
            
            // If the found palindrome is longer than the previously recorded one, update the start and end pointers
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        // Return the longest palindromic substring found
        return s.substring(start, end + 1);
    }

    // Method to expand around the center and find the length of the palindrome
    private static int expandAroundCenter(String s, int left, int right) {
        // Expand while the characters at the current left and right indices are equal and within bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        // Return the length of the palindrome found
        return right - left - 1;
    }
}
