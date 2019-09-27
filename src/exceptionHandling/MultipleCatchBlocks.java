package exceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		System.out.println("program is started");
		System.out.println("program is in progress");

		int a = 100;
		try {
//			System.out.println(a / 0);

			String s = "welcome";
			int n = Integer.parseInt(s); // numberformat exception //convert string into number

		} catch (ArithmeticException e) {
			System.out.println("Arithemtic exception occured..handled successfully");
		}

		catch (NullPointerException e) {
			 System.out.println("NullPointerException occured..handled successfully");
		}

		catch (NumberFormatException e) {
			System.out.println("NumberFormatException exception occured..handled successfully");
		}

		finally {
			System.out.println("none of the exceptions above occured!");
		}
		
		System.out.println("program is completed");
		System.out.println("program is exited");
	}

}
