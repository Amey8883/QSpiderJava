package String;

import java.util.Arrays;

public class Constructor_String {

	public static void main(String[] args) {

//		String str = new String(); //public string();
//		System.out.println(str);
		
//		String str1 = new String("Hello");  //public String(String str);
//		System.out.println(str1);
		
//		StringBuffer sb = new StringBuffer("Hello");
//		String str1 = new String(new StringBuffer("World")); //public String(StringBuffer sb);
//		System.out.println(str1);
//		String str = new String();
//		System.out.println(str);
		
//	    StringBuilder sb = new StringBuilder("Hello"); // public String(StringBuilder sb);
//	    String s2 = new String(sb);
//	    System.out.println(s2);
		
//		char[] ch = {'R','A','M','E','S','H'};
//		System.out.println(Arrays.toString(ch));  //public String(charArray c);
//		String str = new String(ch);
//		System.out.println(str);
		
//		byte[] arr = {65,66,67,68};
//		System.out.println(Arrays.toString(arr));  //public String(Byte Array b);
//		String str = new String(arr);
//		System.out.println(str);
		
		
		
		
		char ch[] = {'R','A','M','E','S','H'};
		byte b[] = {65,66,67,68,69,70};
		
		String str = new String(b,1,4);
		System.out.println(str);
		
		String str2 = new String(b);
		System.out.println(str2);
		
		String str1 = new String(ch,0,3);
		System.out.println(str1);
		
		String str4 = new String(ch);
		System.out.println(str4);
	}
}
