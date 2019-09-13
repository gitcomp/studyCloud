package studyAgain;
/*1) Create a class Calculation with the following methods. 

Class Name: Calculation

int sum(int x, int y)  :  Should accept two integer parameters and returns sum of two numbers.
int  sum(int x, int y, int z) : Should accept three integer parameters and returns sum of three numbers.
double sum(double x, double y)  : Should accept  two double type parameters and returns sum of two numbers.
double sum(double x, double y, double z) : Should accept  three double type parameters and returns sum of three numbers.

Now, create object for Calculations class  ‘cal’ then call different methods by passing different inputs.
*/

public class Calculation { //method overloading

	int sum(int x, int y) {
		return x + y;
	}

	int sum(int x, int y, int z) {
		return x + y + z;
	}

	double sum(double x, double y) {
		return x + y;
	}

	double sum(double x, double y, double z) {
		return x + y + z;
	}

	public static void main(String[] args) {

		Calculation cal = new Calculation();
		System.out.println(cal.sum(7.5, 9));
		
		System.out.println(cal.sum(8, 3));

	}

}
