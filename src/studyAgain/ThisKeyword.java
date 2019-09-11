package studyAgain;

public class ThisKeyword {
  int x=0;
  int y = 0;
  
  //constuctor
	/**public ThisKeyword(int a, int b) {
		x=a;
		y=b;
	}
	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword(6, 9);
		tk.x=66;
		System.out.println(tk.x);
		System.out.println(tk.y);
	}*/
  
  //constructor
  ThisKeyword(int x, int y){
	  this.x=x;
	  this.y=y;
  }
public static void main(String[] args) {
	ThisKeyword tk=new ThisKeyword(6, 44);
	System.out.println(tk.x);
	System.out.println(tk.y);
}	
	
}
