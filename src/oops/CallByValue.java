package oops;

public class CallByValue {

	int x;

	public void addition(int a) {
		x = a + 5;
		// System.out.println(x);
	}

	public static void main(String[] args) {

		CallByValue cv = new CallByValue();
		cv.addition(10);
		System.out.println(cv.x);// 15 you access x through the object cv.
	}

}
