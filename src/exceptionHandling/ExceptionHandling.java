package exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("program is started");
		System.out.println("program is in progress");
		
		// PART 1
//		Scanner input= new Scanner(System.in);
//		System.out.println("enter a number:");
//		int num= input.nextInt();
//		int a = 100;
//		try{
//			System.out.println(a/num);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("``can not divide by zero``");
//		}
		
		//PART 2
//		numberformat exception
		String s = "welcome";  
		int a=0;
		
		try {
		a=Integer.parseInt(s); //numberformat exception //convert string into number
		}
		catch (NumberFormatException e) {
			System.out.println("NumberFormatException is here, but handled!");
		}
		
		System.out.println(a);
		
		//PART 3
//		String s = "welcome";
//		System.out.println(s.length());  //NullPointerException
//		System.out.println(s);
		
		//PART 4
//		int a []= new int[5];
//		a[10]=100; //ArrayIndexOutOfBoundsException
		
		
		
		System.out.println("program is completed");
		System.out.println("program is exited");
	}
	
	
	
}
