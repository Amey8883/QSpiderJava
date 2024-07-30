package String;

public class String_And_StringBuffer_Example {

    public static void main(String[] args) {
        // Define a String variable with the value "Java"
        String name = "Java";
        
        // Attempt to concatenate "Python" to the String 'name'
        // Note: Strings are immutable in Java, so this operation does not change the original 'name' string
        name.concat("Python");
        
        // Print the value of 'name'
        // Output will be "Java" because the original String is unchanged
        System.out.println(name);
        
        // Define a StringBuffer variable with the value "Swift"
        StringBuffer sb1 = new StringBuffer("Swift");
        
        // Append "Ruby" to the StringBuffer 'sb1'
        // StringBuffer is mutable, so this operation modifies the original 'sb1'
        sb1.append("Ruby");
        
        // Print the value of 'sb1'
        // Output will be "SwiftRuby" because the StringBuffer was modified
        System.out.println(sb1);
    }

}
