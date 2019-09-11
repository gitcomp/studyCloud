package studyAgain;

public class ThisExampleWCons {

	int x,y;
	int width, height;
	
	
	public ThisExampleWCons() {
	this(0,0,1,1); 
	}
	
	ThisExampleWCons(int width, int height){
		this(0,0,width, height);
	}
	
		ThisExampleWCons(int x, int y, int width, int height){
		this.x=x;
		this.y=y;
		this.width= width;
		this.height= height;
	}
	
		public static void main(String[] args) {
		ThisExampleWCons th= new ThisExampleWCons();
//		System.out.println(th.height);
//		System.out.println(th.width);
//		System.out.println(th.x);
//		System.out.println(th.y);

		ThisExampleWCons th2= new ThisExampleWCons(4, 55,66,77);
		System.out.println(th2.height);
		System.out.println(th2.width);
		System.out.println(th2.x);
		System.out.println(th2.y);
		System.out.println();
		}
	
		
		
}
