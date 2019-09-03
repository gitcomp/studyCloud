package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class TwoDimArray {
public static void main(String[] args) {
					   //row, column
	int arr[][]= new int [3][2]; //3 rows and 2 columns//STATIC ARRAY(fixed array)
	
//	arr[0][0]=100;	arr[0][1]=200;
//	arr[1][0]=300;	arr[1][1]=400;
//	arr[2][0]=500;	arr[2][1]=600;
//	System.out.println(arr.length); 	//gives number of rows
//	System.out.println(arr[0].length);	//gives number of columns in the 1st row
//	System.out.println((arr[1][1]));//print 400

       //DYNAMIC ARRAY as we do not know element size yet!
                  //1st row    2nd row   3rd row
	int arr2[][]= {{100,200}, {300,400}, {500,600}};//rows added in curly braces one after another
//	System.out.println(arr2.length);  	//gives number of rows only
//	System.out.println(arr2[1].length);	//gives number of column in the 2nd row
	
	//printing array elements(easy way)
//	for (int[] i : arr2) {
//		System.out.println(Arrays.toString(i));
//	}
	
//	printing array elements(hard way)
//	for (int i=0; i<arr2.length; i++) {   //i is row index
//		for(int j=0; j<arr2[i].length; j++) {   //j is for column index
//			System.out.println(arr2[i][j]);
//		}
//	}
	
	//enhanced for loop - for each loop
	for (int [] i: arr2) {
		for (int j : i) {
		System.out.print(j+ " ");	
		}
		System.out.println();
	}
	
	
	
	
	
} 
}
