package oops;

public class ConstructorDemo {

	int x, y,z;

	 ConstructorDemo() { // default constructor
		x = 100;
		y = 200;
		System.out.println(x + y);
	}

	 ConstructorDemo(int a, int b){  //constructor overloading
		 x=a;
		 y=b;
		 System.out.println(x+y);
	 }

	 ConstructorDemo(int a, int b, int c){  //const. overloading
		x=a; y=b; z=c;
		System.out.println(x+y+z);
	}
 
	//overloading: same constructor or method can be re-defined 
	//			   within the same class
	
	public static void main(String[] args) {
//depending number of parameters, the intended constructor is invoked.
		ConstructorDemo cm = new ConstructorDemo(3,5,5);
				
	}

}
