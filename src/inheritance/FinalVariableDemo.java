package inheritance;

public class FinalVariableDemo {

	final int speed=100;//to make this var constant
	
	public static void main(String[] args) {
	FinalVariableDemo fm =new FinalVariableDemo();
	//fm.speed=200;//compile time error, not possible
	System.out.println(fm.speed);
		
	}

}
