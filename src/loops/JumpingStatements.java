package loops;

public class JumpingStatements {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break; // stops after being 5, no more move
			}
			System.out.println(i);
		}
		System.out.println("ended here");

		// using continue statement
		for (int i = 1; i <= 10; i++) {
			if (i==5 || i==7) {
				continue;   //just skips this value
			}
			System.out.println(i);
		}
		System.out.println("ended here again");

	}
}
