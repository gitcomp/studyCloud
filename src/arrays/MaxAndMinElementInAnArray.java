package arrays;

public class MaxAndMinElementInAnArray {

	public static void main(String[] args) {
		int arr[] = { 10, 100, 20, 50, 5, 60 };

		int max = arr[0]; // let index zero element be the max

		for (int n : arr) {
			if (max < n) {
				max = n;
			}
		}
		System.out.println("max is :" + max);

		int min = arr[0]; // let the min is first element
		for (int n : arr) {
			if (n < min) {
				min = n;
			}
		}
		System.out.println("min is: " + min);

	}
}
