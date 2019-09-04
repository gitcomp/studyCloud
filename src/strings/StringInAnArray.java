package strings;

import java.util.Arrays;

public class StringInAnArray {

	public static void main(String[] args) {

		String s[] = { "welcome", "selenium", "java", "python", "javascript" };
		String searchString = "java";
		boolean flag = false;

		for (String i : s) {
			if (i.equals(searchString)) {
				System.out.println("string found in array: " + i);
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("not found");
		}
	}
}
