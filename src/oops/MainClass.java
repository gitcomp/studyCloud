package oops;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(StaticExample.a);
//		System.out.println(StaticExample.b);//can not access non static variable
		StaticExample.m1(); // direct access, because the method is static too!
//        StaticExample.m2(); // can not access. m2 is not static method

		StaticExample se = new StaticExample();
		System.out.println(se.b);// 20 non static var.
		se.m2();
		
		System.out.println(StaticExample.a);// still can access directly
		se.m3();
	
	System.out.println(se.str.length());//non-static call
	System.out.println(StaticExample.str.length());//static call
	
	
	}

}
