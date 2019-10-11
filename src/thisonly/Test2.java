package thisonly;

public class Test2 {

	int a;
	int b;
	
	Test2(int a , int b){
		this.a=a;
		this.b=b;
		System.out.println("parametirized ");
	}
			
	//default constructor
	
	Test2(){
	this(10,15);
	System.out.println("this is inside");
	}
		
		public static void main(String[] args) {
		Test2 obj = new Test2();
	
	}
	
}
