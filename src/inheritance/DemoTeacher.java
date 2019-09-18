package inheritance;

class Teacher {

	String designation = "Teacher";
	String collegeName = "BusyQA";

	void does() {
		System.out.println("teaching");
	}

}

class ComputerTeacher extends Teacher {
	String designation = "Computer Teacher";
	String collegeName = "Computer School of BusyQA";
	
	
	void does() {
		System.out.println("teaching Computer only");
		super.does();
		System.out.println(super.collegeName);
	} 
	
}

class DemoTeacher {
	public static void main(String[] args) {
		ComputerTeacher ct = new ComputerTeacher();
		ct.does();
		System.out.println(ct.collegeName);
		System.out.println(ct.designation);
	System.out.println();
	}
}
