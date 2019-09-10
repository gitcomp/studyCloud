package oops;

public class CallByRefrence {

	int x;

	public void addition(CallByRefrence a) {
		x = a.x + 5;
		System.out.println(x); //15
	}
	
	
	public static void main(String[] args) {
	CallByRefrence cr= new CallByRefrence();
	
	cr.x=10;
	cr.addition(cr);	
	System.out.println(cr.x);//15	
	

	}

}
