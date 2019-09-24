package interfaceDemo;

interface A {

	int a = 10; // by default variables are static and final

	void m1(); // abstract and public by default
}


public class Test implements A {

	public void m1() {
		System.out.println(a);
	}

	public static void main(String[] args) {
//	A a = new A(); //not possible

		//A t = new Test();
		Test t = new Test();  //same as above
		t.m1();
		
	}
}
