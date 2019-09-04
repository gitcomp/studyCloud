package strings;

public class StringMethods {

	public static void main(String[] args) {
		// String is a data type
		String str = "welcome";
		int len = str.length();
		System.out.println(str.length());// 7 num of chars in the string

		// String is a pre-defined class, you can create an object from it.
		String str1 = new String();
		str1 = "book";
		System.out.println(str1.length()); // if not initialized, no element inside the variable

		System.out.println(str.concat(str1)); //combines two strings
        System.out.println(str+str1);	//combines two strings
        
        System.out.println(str.concat(str1)==str+str1);//false
        System.out.println(str.concat(str1).equals(str+str1)); //true
        
        String s1="where";
        String s2="are";
        String s3="you";
        String sum= s1.concat(s2).concat(s3); //combine 3 or more..
        System.out.println(sum);
        
        //trim function(method)
        String s ="    java is cool    ";
        System.out.println(s);
        System.out.println(s.trim());  //removes spaces from right and left 
        
        
        
	}

}
