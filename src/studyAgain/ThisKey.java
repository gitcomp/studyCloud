package studyAgain;

public class ThisKey {

	int a, b;

//	void add(int a, int b) {
//		this.a = a;
//		this.b = b;
//	}

	public ThisKey(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println("sum is: " + (a + b));
	}

	public static void main(String[] args) {
		ThisKey tk = new ThisKey(5, 8);

//		tk.add(5, 6);
		tk.display();
	}

}
