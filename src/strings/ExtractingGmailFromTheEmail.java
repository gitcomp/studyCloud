package strings;

public class ExtractingGmailFromTheEmail {

	public static void main(String[] args) {
		//print out gmail
				//	01234567      13  
		String str="someone@gmail.com";
		int indexOfAtSign = str.indexOf('@');//7
		int indexOfDot    = str.indexOf('.');//13
		
		System.out.println(indexOfAtSign);
		System.out.println(indexOfDot);
		
		System.out.println(str.substring(indexOfAtSign+1, indexOfDot));//gmail
	}

}
