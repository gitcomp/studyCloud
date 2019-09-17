package inheritance;

import java.awt.print.Printable;

//single level inheritance
class A{   //parent
	int a;
	void display() {
		System.out.println(a);
	}
}

class B extends A{    //B is child
	int b;
	void print() {
		System.out.println(b);
	}
}

class C extends B{
	int c;
	void show() {
		System.out.println(c);
	}
}


public class InheritanceTypesDemo {

	public static void main(String[] args) {
  		//multi level iheritence
		A objA = new A();
		objA.a=100;
		objA.display();
		
		B objB= new B();
		objB.a=10;
		objB.b=20;
		objB.display();
		objB.print();
 
		C objC= new C();
		objC.c=30;
		objC.show();
		
		objC.a=66;
		objC.display();
		
		objC.print();
	    	
	}

}
