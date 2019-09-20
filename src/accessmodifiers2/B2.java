package accessmodifiers2;
//for public access modifier
import accessmodifiers.A2;

public class B2{

	void m2() {
		System.out.println("this is m2");
	}
	
	
	public static void main(String[] args) {
		//B2 obj= new B2();
		A2 obj = new A2();
		obj.a=350;
		obj.m1();

		B2 b2 = new B2();
		b2.m2();
		
		
	}
}
