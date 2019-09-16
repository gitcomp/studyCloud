package studyAgain;

public class CallByReff {

	int x;

	public void addition(CallByReff a) {
		//x=a+5;
		x = a.x + 5;
		
		System.out.println(x);
	}


	
	
	public static void main(String[] args) {
    CallByReff cr= new CallByReff();
   
    cr.x=10;
    cr.addition(cr);
    CallByVal.x=55;
    
	}

}
