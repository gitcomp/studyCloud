package loops;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		int a = 300;
		int b = 200;

		if (a > b) {
			System.out.println(a + " is greater than " + b);
		}
		else if (b > a) {
			System.out.println(b + " is greater than " + a);
		}

		else {
			System.out.println(a + " and " + b + " are equal");
		}
	}

}
