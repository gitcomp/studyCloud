package strings;

public class Replace_SubStringMethods {

	public static void main(String[] args) {
		// replace()
		String s = "Welcome";
//		System.out.println(s.replace('e', 'a')); // e becomes a, single char replacement

		s = "Welcome to Java";
//		System.out.println(s.replace("Java", "Selenium"));//multiple chars replacement

		//subString()
	   //  0123456
		s="Welcome";
		System.out.println(s.length());	//7 chars total
		System.out.println(s.substring(1)); //elcome
		System.out.println(s.substring(3, 7)); //come
         System.out.println(s.substring(3, s.length())); //come		
	}

}
