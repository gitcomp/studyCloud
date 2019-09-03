package arrays;

import java.util.Iterator;

public class FindNegativeAndPositiveNumbersInAnArray {

	public static void main(String[] args) {

		int arr[] = { 1, -5, 3, 5, 8, -5, 2, -6, 0, -12, 8 };

		for (int i : arr) {
			if (i < 0) {
			System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int j : arr) {
			if (j >= 0) {
				System.out.print(j + " ");
			}
		}
	}
}
