package oops;

public class Teacher {

	int tid;
	String tname;
	char tgrade;
	
	public Teacher(int id, String name, char grade) {
	tid=id;
	tname=name;
	tgrade=grade;
	}
	
	void dispaly() {
		System.out.println(tid+ " "+tname+" "+tgrade );
	}
	
	
}
