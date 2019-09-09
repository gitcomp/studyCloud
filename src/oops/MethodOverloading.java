package oops;

public class MethodOverloading {

	int x,y;
	double z;
	
	int addition() {
		x=10;
		y=20;
		return x+y;
	}
	
	int addition(int a, int b) {
		x=a;
		y=b;
		return x+y;
	}
	
	double addition(int a, double b) {
		x=a;
		z=b;
		return x+z;
	}
	
	double addition(int a, int b, double c) { //method definition:name, data type, number of arguments
		x=a;
		y=b;
		z=c;
		return x+y+z;
	}
	
	
	public static void main(String[] args) {
		MethodOverloading mo= new MethodOverloading();  //this is not constructor so we have to explicitly call the methods
		System.out.println(mo.addition()); //1st method
		System.out.println(mo.addition(3, 6)); //2nd method
		System.out.println(mo.addition(4, 7.6)); //3rd method
		System.out.println(mo.addition(4, 6, 8.9)); //4th method
	}
}
