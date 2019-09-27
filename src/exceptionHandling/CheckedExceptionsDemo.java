package exceptionHandling;

public class CheckedExceptionsDemo {
													//method level
	public static void main(String[] args) throws InterruptedException {
		System.out.println("program is started");
		System.out.println("program is in progress");

			//METHOD 1: TRY/CATCH BLOCK 
//		try {
//			Thread.sleep(5000);
//		} 
//		catch (InterruptedException e) {
//			e.printStackTrace();
//		} //Interrupted Exception (checked exception). 
		  //handle with 2 ways:try/catch OR throws
		  //statement level
		
		//METHOD 2: use throws keyword
		
		Thread.sleep(5000);//InterruptedException
		
		System.out.println("program is completed");
		System.out.println("program is exited");
	}

}
