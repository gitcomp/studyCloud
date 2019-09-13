package studyAgain;

class sdf {
	public static void main(String[] args) {
//		String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
//		String[] arrSplit_2 = strMain.split(", ", 9);
//		for (int i = 0; i < arrSplit_2.length; i++) {
//			System.out.println(arrSplit_2[i]);

//		}

		
		// reverse integer---> 54321
		
		int a = 12345;
		System.out.println(a); //int a
		System.out.println("=========1");
		//System.out.println(a.getClass());	primitive , not have class!!
		
        String num= Integer.toString(a);
        
        System.out.println(a);//a is now num and is a string 12345
        System.out.println(num.getClass());
        System.out.println(num.length());
        
        String revNum="";
        
        for(int i=num.length()-1; i>=0; i++ ) {
        	revNum=revNum+num.charAt(i);
        	System.out.println(i);
        }
		
		
		
	}

}
