package accessmodifiers2;

import accessmodifiers.A; //if the other class is in another package, 
							// first need to import.
						// import packagename.classname

public class B extends A{

	public static void main(String[] args) {

		B obj= new B();
		obj.a=250;
		obj.m1();
		
		//i can access class A method and variables via inheritance.
		
		
	}

}
