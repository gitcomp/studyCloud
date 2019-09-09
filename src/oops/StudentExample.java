package oops;

/* Create a Student class contains the following variables and methods.
Class Name: Student
Variables : SID , Sname, Sub1,Sub2,Sub3

Methods:
getStuData()  Takes student details SID and Sname  as parameters and assign them to variables.
getStuMarks() Takes student marks as parameters and assign them to Sub1, Sub2, Sub3.
totalMarks()  Calculate total marks and print the student details with total marks. 

Now, create objects from Student class stu1, stu2 etc.  Then call Student class methods.
*/

public class StudentExample {

	int sID;
	String sname;
	int sub1,sub2,sub3;
	
	void getStuData(int ID, String name) {
		sID=ID;
		sname=name;
		System.out.println(sID);
		System.out.println(sname);
	}
	
	void getStuMarks(int s1, int s2, int s3) {
		sub1=s1;
		sub2=s2;
		sub3=s3;
	}
	
	void totalMarks() {
		int sum= sub1+sub2+sub3;
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
	
		StudentExample stu1 = new StudentExample();
		stu1.getStuData(2, "Andy");
		stu1.getStuMarks(5, 8, 6);
		stu1.totalMarks();
		
	}
	
	
}
