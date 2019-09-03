package arrays;

public class EvenNumbersInAnArray {

	public static void main(String[] args) {
		int arr[] = { 10, 15, 20, 25, 30, 35, 40, 45 };
		int occurence = 0;

		// print only even numbers
		for (int i : arr) {
			if (i % 2 == 0) {
				System.out.println(i);

			}
		}

		// find second even number
		for (int i : arr) {
			if (i % 2 == 0) {
				occurence++;
			}
			if (occurence == 2) {
				System.out.println("second even number is: " + i);
				break;
			}
		}
	}

}
