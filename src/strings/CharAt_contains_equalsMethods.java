package strings;

public class CharAt_contains_equalsMethods {

	public static void main(String[] args) {
		String s= "Welcome";
		
		char str =s.charAt(2);
		System.out.println(str);
		
		boolean bl= s.contains("lco");
		System.out.println(bl);

		CharSequence ss= s.subSequence(1, 4); //not really understood!!
		System.out.println(ss);
		
		System.out.println(s.equals("Welcome")); //true compares contents
		System.out.println(s.equalsIgnoreCase("welcOME")); //TRUE
		
		System.out.println(s.charAt(12)); //IndexOutOfBoundsException
	}

}
