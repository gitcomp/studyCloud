package inheritance;

class Parent {
	int a;

	void display() {
		System.out.println(a);
	}
}

class Chid1 extends Parent {
	int x;

	void print() {
		System.out.println(x);
	}
}

class Child2 extends Parent {
	int y;

	void show() {
		System.out.println(y);
	}
}

public class HierarchicalInheritamceDemo {
//one parent, multiple children
	public static void main(String[] args) {
	
		Chid1 c1 = new Chid1();
		c1.a = 100;
		c1.display();

		c1.x = 200;
		c1.print();

		Child2 c2 = new Child2();
		c2.a = 3;
		c2.display();

		c2.y = 9;
		c2.show();
	}
}
