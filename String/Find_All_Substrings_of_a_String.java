    // Sample Input:
    // input = "abc"
    //
    // Sample Output:
    // a
    // ab
    // abc
    // b
    // bc
    // c

    // This program finds and prints all substrings of a given string.
    // A substring is a contiguous sequence of characters within a string.
    // For example, the substrings of "abc" are "a", "ab", "abc", "b", "bc", and "c".
package String;

public class Find_All_Substrings_of_a_String {
    
    public static void main(String[] args) {
        String input = "abc";
        
        // Loop through all possible starting points of substrings
        for(int i = 0; i < input.length(); i++) {
            // Loop through all possible ending points of substrings
            for(int j = i + 1; j <= input.length(); j++) {
                // Print the substring from index i to j
                System.out.println(input.substring(i, j));
            }
        }
    }
}
