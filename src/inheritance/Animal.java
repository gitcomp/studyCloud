package inheritance;
/*super keyword: used in inheritance only?
   	1. refer immediate parent class instance variable
   	2. invoke immediate parent class method 
*/

public class Animal {
	String color = "white";
	
	void eating() {
		System.out.println("eating...........");
	}
}
	
class Dog extends Animal {
	String color = "black"; // overriding variable
	
	void eating() {  //overriding method
		System.out.println("eating bread...");
		super.eating(); //eating..............
	}
	
	
	void display() {
		System.out.println(color);//black
		System.out.println(super.color);//white 
	}
				
}
