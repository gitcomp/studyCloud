package studyAgain;

public class CallByRef {

	int x; //class var
	
//	public void addition(int a) {
//		x=a+5;
//		System.out.println(x);//15
//	}
	
	public void addition(CallByRef a) {
		x=a.x+5;
		System.out.println(x);
	}
	
	
	
	public static void main(String[] args) {
	
		CallByRef cr= new CallByRef();

//		cr.addition(10); //15 goes to method and run
//		System.out.println(cr.x); // 15 directly access 
		
//		cr.x=10; //this is object. we will pass object
//		cr.addition(cr.x); //15 as well
		
		cr.x=10;
		cr.addition(cr);
		System.out.println(cr.x);
		
	}

}
