package loops;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 1; 						// Initialize
		while (i <= 10) { 				// condition
			System.out.println("hello");
			i++; 						// i=i+1 //increment
		}

		//print even numbers between 1 and 10 
		int j=2;
		while (j<=10) {
			System.out.println(j);
			j=j+2;
		}
		
		//odd numbers only between 1 and 10
		int k=1;
		while (k<=10) {
			System.out.println(k);
			k+=2;
		}
		
		//from 10 to 1 descending order
		int p=10;
		while (p>=1) {
			System.out.println(p);
			p--;
			
		}
	}

}
