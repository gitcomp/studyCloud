package arrays;


public class SearchElementInArray {

	public static void main(String[] args) {
		int arr[] = { 10, 200, 100, 50, 70, 30 };
		int num = 100;
		boolean flag = false;

		// check if num=100 is element of the array.
		for (int i : arr) {
			if (i == num) {
				System.out.println("element found");
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("element not found");
		}
	}
}
