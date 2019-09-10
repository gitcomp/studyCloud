package oops;

public class ThisKeywordInConstructor {

	int a, b; // class=global=instance variables

	ThisKeywordInConstructor(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println("sum is: " + (a + b));
	}

	public static void main(String[] args) {

		ThisKeywordInConstructor th = new ThisKeywordInConstructor(5, 6);
		th.display();
	}

}
