package inheritance;

class Parent2 {
	
	void display(int a) {
		System.out.println(a);
	}
}

class Chid3 extends Parent2 {
	
	void print(int x) {
		System.out.println(x);
	}
}

class Child4 extends Parent2 {
	
	void show(int y) {
		System.out.println(y);
	}
}

public class HierarchicalInheritamceDemoPassValue{
//one parent, multiple children
	public static void main(String[] args) {
	
		Chid3 c3 = new Chid3();
		c3.display(100);

		c3.print(200);

		Child4 c4 = new Child4();
		c4.display(3);

		c4.show(9);
	}
}
