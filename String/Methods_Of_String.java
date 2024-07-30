package String;

import java.util.Arrays;

public class Methods_Of_String {

	public static void main(String[] args) {

//		String str = "Hello";
//		String str1 = new String("Hello"); 
//		System.out.println(str.length());  // public int length();
//		System.out.println(str1.length());
		
//		String a = new String("RAMESH");
//		System.out.println(a.charAt(0));
//		System.out.println(a.charAt(a.length()-1));  //public charAt(int index)
//		System.out.println(a.charAt(1));
//		System.out.println(a.length());
		
//		String str = new String();
//		System.out.println(str.isEmpty());  //public isEmpty()

//		String str = new String("ABCDEFG");
//		for(int i = 0 ; i < str.length() ; i++ )
//		{
//			System.out.println(str.charAt(i)+":"+str.codePointAt(i)); //public codePointAt()
//		}
	 
//		String str = new String("ABCDEF");
//		System.out.println(str.toLowerCase());  //public toLowerCase()
		
//		String str = new String("abcdef");
//		System.out.println(str.toUpperCase());  //public toLowerCase()
		
//		String str = new String("Amey");
//		String str1 = new String("Deshpande"); //public concat()
//		System.out.println(str.concat(str1));
		
		
//		String str1 = new String("Deshpande");
//		System.out.println(str1.substring(1,4));  //substring()
		
//		String str1 = new String("Deshpande");
//		System.out.println(str1.indexOf("s"));  //indexOf()
		
//		String str = new String("Deshpande");
//		System.out.println(str.lastIndexOf('e'));  //lastIndexOf()
		
//		String str = new String("Deshpande");
//		System.out.println(str.codePointBefore(1)); //codePointBefore
		
//		String str = new String(" Amey ");
//		System.out.println(str.trim());  //  trim()
		
		String name = "Kanchana";
		if(name.startsWith("Kan"))   //startsWith()
		{
			System.out.println("I love Java");
		}else if(name.endsWith("ana"))  //endsWith()
		{
			System.out.println("I love Coding");
		}
		else {
			System.out.println("I love Programming");
		}
	}
}
