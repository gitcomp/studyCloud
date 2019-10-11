package thisAndSuper;

//super is used to refer parent class's instance and static members


class Parent {
	int a = 10;
	static int b = 20;
}

class Child extends Parent {

	void m1() {
		System.out.println(super.a);
		System.out.println(super.b);
		
	}

	public static void main(String[] args) {
//		Child ch = new Child();
//		ch.m1();
		//or 
		new Child().m1();
		
	}
}

