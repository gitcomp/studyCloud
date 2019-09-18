package inheritance;

class Vehicle{
	final void run() {
		System.out.println("running....");
	}
}

class Honda extends Vehicle{
//	void run() { //you can not override parent class method, because it is final!
		System.out.println("honda runs fast");
	}
}


public class FinalMethodDemo {

	public static void main(String[] args) {
		

	}

}
