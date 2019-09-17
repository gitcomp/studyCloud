package inheritance;
/// method overloading: you are changing the definition=signature,
// 						so each is a new method. They can be in the same class. 
public class Mo {

	void m1(){  ///method definition 
	System.out.println("m1");	//method body
	}
	
	void m1(int a) {
		System.out.println("m2: "+ a);
	}
	
	void m1(Double a) {
		System.out.println("m3: " +a);
	}
	
	
	public static void main(String[] args) {
		Mo mo = new Mo();
		mo.m1();
		mo.m1(5);
		mo.m1(12.67);

	}

}
