package oops;

public class ThisKeywordinMethod {
	int a,b; // class=global=instance variables
		
	void add(int a, int b) { //method= external variables
//	class var--- method var.
		this.a=a;    //this represents the class
		this.b=b;
	}
	
	
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println("sum is: "+ (a+b));
	}
	
	public static void main(String[] args) {
		ThisKeywordinMethod th = new ThisKeywordinMethod();
		th.add(3, 8);
		th.display();
		
		
	}

}
