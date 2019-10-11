package thisonly;

public class Test {

	int a;
	int b;
	
	Test(int a, int b){
		this.a = a;  //refer current class's instance variables
		this.b = b;
	}
	
	void display() {
		System.out.println(a + " and "+ b);
	}
	
	
	public static void main (String [] argssss) {
//		new Test(10,23).display();
//		or
		Test t = new Test(10,23);
		t.display();
		
		
	}
	
	
}
