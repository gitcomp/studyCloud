package strings;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "Welcome";
		String reversed = "";

		for (int i = s.length()-1; i>= 0; i--) {
			reversed = reversed + s.charAt(i);
		}
		System.out.println(reversed);
	}

}
