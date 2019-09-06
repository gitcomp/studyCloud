package oops;

public class Student {

	int sid;
	String sname;
	char sgrade;
	
	void getValues(int id, String name, char grade){
		sid=id;
		sname=name;
		sgrade=grade;
	}
	void display() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sgrade);
	}
}
