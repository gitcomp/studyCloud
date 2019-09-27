package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExamples {

	public static void main(String[] args) throws IOException, InterruptedException {

	FileReader fr = new FileReader("C:\\Users\\ahmet.duman\\" + "eclipse-workspace\\study\\JavaNotes.txt");

	BufferedReader br = new BufferedReader(fr);
	
	Thread.sleep(5000);//this adds InterruptedException
	
	System.out.println(br.readLine());
			
	}
}
