package oops;

/* Write a program to demonstrate constructor.
Create a class ‘Calculation’ with 3 integer variable.
Create a constructor for assign the values into variables.
Then create another method ‘sum’ to calculate sum of 3 numbers.

Now, create object and call constructor by passing 3 integer values then call sum method.
 */


public class Calculation2 {

	int a, b, c;

	Calculation2(int x, int y, int z) {
		a = x;
		b = y;
		c = z;
	}

	int sum() {
		int sum = a + b + c;
		return sum;
	}

		
	public static void main(String[] args) {

		Calculation2 cal= new Calculation2(4, 5, 6);
		System.out.println(cal.sum());
		
	
	}

}
