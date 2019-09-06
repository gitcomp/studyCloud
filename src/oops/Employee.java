package oops;
//main method is in the same class, not practical..
public class Employee {

	int eid;
	String ename;
	int deptno;
	String job;

	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(deptno);
		System.out.println(job);
	}
	
	/*public static void main(String []args) {
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="Andy";        //through the object, I can access class variables and class methods!!!
		emp1.deptno=10;
		emp1.job="Manager";
		
		emp1.display();
	}*/
	
}