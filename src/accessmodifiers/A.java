package accessmodifiers;

public class A {

	protected int a = 100;

	protected void m1() {
		System.out.println(a);
	}

	
	public static void main(String[] args) {
		A a = new A();
		a.m1();
	}
	
}

