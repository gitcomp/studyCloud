package studyAgain;

public class CallByVal {

	static int x;
	
	public static void addition(int a) {
		x=a+5;
		
		
		System.out.println(x);
	}
	
	
	
	
	
	public static void main(String[] args) {
//	CallByVal cv = new CallByVal();
//	cv.addition(10);
//
//	System.out.println(cv.x);
	addition(12);
	
		
	}

}
