package oops;

public class Calculation {

	int x = 100, y = 200;

	void sum1() {					// no params, no return
		System.out.println(x + y);
	}

	int sum2() { 					// no param, but return
		return x + y;
	}

	void sum3(int a, int b) {		 // take params, no return
		x = a;
		y = b;
		System.out.println(x + y);
	}

	int sum4(int a, int b) {
		x=a;
		y=b;
		return(x+y);
	}
		
		
	public static void main(String[] args) {

		Calculation cal = new Calculation();
		cal.sum1();

		int res = cal.sum2();
		System.out.println(res);

		cal.sum3(10, 20);
	
		int res4= cal.sum4(10, 40);
		System.out.println(res4);
	}

}
