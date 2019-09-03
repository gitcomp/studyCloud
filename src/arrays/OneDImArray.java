// ARRAYS: collection of elements(values) of same data types. one variable stores multiple values.
//single dim and multiple dim.

package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class OneDImArray {
	public static void main(String[] args) {
//		int arr[] = new int[5]; // static array, as i know the exact number of elements in this array
//		arr[0] = 100;
//		arr[1] = 200;
//		arr[2] = 300;
//		arr[3] = 400;
//		arr[4] = 500;
//
//		System.out.println(Arrays.toString(arr));

		int arr2[] = { 100, 200, 300, 400, 500 }; // dynamic array, you do not need to know how many values
//		System.out.println(Arrays.toString(arr2)); //will print the entire array elements
//
//		System.out.println(arr2.length); // size of an array
//		System.out.println(arr2[2]); // will give 300, because index of 2 is 300.

//		for(int i=0; i<5;i++) {   //classic for loop to read elements in an array
//			System.out.println(arr2[i]);
//		}

		// better way to read the array
//		for(int i=0; i<arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}

		// EVEN BETTER WAY..for each loop OR enhanced for loop
		for (int i : arr2) {
			System.out.println(i);
		}

	}

}
