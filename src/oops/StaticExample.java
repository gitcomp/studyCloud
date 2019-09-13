package oops;

public class StaticExample {

	static int a = 10;
	int b = 20;

	static String str = "Hello";
	
// create static method
	static void m1() {
		System.out.println("this is m1 method, static");
	}

// create non-static method
	void m2() {
		System.out.println("this is m2 method, non-static");
	}

// create another non-static method
	void m3() {
		System.out.println("====this is m3 method, non-static====");
		m1();
		m2();
		System.out.println(a);
		System.out.println(b);
	}
	
	
//	public static void main(String[] args) {
////		System.out.println(a);
////		System.out.println(b);//can not access non static variable
//	//	m1();   //direct access, because the method is static too!
////		m2(); // can not access. m2 is not static method
//		
//		StaticExample se= new StaticExample();
////			System.out.println(se.b);//20 non static var.
////		    se.m2();

////			System.out.println(a);//still can access directly
//			se.m3();
//	}
	
	
}
