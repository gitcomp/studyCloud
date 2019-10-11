package thisAndSuper;

public class RR {
//this is used to refer current class's instance and static members.
	int a = 10;
	static int b=20;
	
	void m1() {
		this.a=100;
		System.out.println(a);
		
		this.b=600;
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
//		this.a=700;
		RR.b=555;
		
		RR r = new RR();
		r.m1();
		//or
		new RR().m1();
			
	}
	
	
}
