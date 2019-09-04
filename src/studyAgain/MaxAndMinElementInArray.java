package studyAgain;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
		// use normal for loop:
		int arr[] = { 10, 100, 20, 50, 5, 60 };

		// find max element
		int max = arr[0]; // let the 1st be the max

		for (int i =1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println("the max is : "+max);

		//find min element 
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<min) {
				min= arr[i];
			}
		}
		System.out.println("min is: "+ min);
		
		
	
	}
}
