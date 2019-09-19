package interfaceDemo;

interface ABC {
	int x = 100; // final and static

	void m1(); // abstract and public

}

interface XYZ {
	int y = 200;

	void m2();
}



public class MultipleInheritanceDemo implements ABC, XYZ {
//I will implement above 2 methods here in this class.
   public void m1(){
	   System.out.println(x);
   }
	
	public void m2() {
		System.out.println(y);
	}
   
	public static void main(String[] args) {
         MultipleInheritanceDemo mi = new MultipleInheritanceDemo();
         mi.m1();
         mi.m2();
	}

}
