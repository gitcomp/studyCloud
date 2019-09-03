package arrays;

import java.util.Arrays;

public class SearchAStringinAnArray {

	public static void main(String[] args) {

		String[] str = { "welcome", "java", "selenium", "python" };
		boolean flag = false;

		for (String st : str) {
			if (st == "selenium") {
				System.out.println("found");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("not found");
		}

	}
}
