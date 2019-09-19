package interfaceDemo;


class A1{
	void m1() {
		System.out.println("m1 from A1 class");
	}
}

interface B1{
	void m2();
}


interface B2{
	void m3();
}

public class HybridInheritanceDemo extends A1 implements B1, B2 {

	public void m2() {
		System.out.println("m2 from B1 interface");
	}
	
	public void m3() {
		System.out.println("m3 from B2 interface");
	}
	
	public static void main(String[] args) {
		HybridInheritanceDemo hi = new HybridInheritanceDemo();
		hi.m1();
		hi.m2();
		hi.m3();
	}

}
