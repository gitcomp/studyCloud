package studyAgain;
/*	Write a program to demonstrate interface.
	Interface A : int a, int b sum()
	Class B : Implements method from A and calculate sum of a and b
*/

interface A {
	int a = 10;
	int b = 20;

	void sum();
}

public class B implements A {

	public void sum() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		B objB = new B();
		objB.sum();

	}

}
