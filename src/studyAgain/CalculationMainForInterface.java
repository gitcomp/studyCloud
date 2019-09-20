package studyAgain;

interface AA{
	int a=0;
	int b=0;
	void add(int a, int b);
	}

interface BB{
	int x=6;
	int y=8;
	void mult();
}


public class CalculationMainForInterface implements AA,BB {

	public void add(int a, int b) {	
	System.out.println("sum is: "+ (a+b));
	}
	
	public void mult() {
		System.out.println("product is: " + (x*y));
	}
	
	public static void main(String[] args) {

		CalculationMainForInterface cal = new CalculationMainForInterface();
		cal.add(4, 55);
		cal.mult();
	}

	
}


