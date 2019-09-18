package inheritance;
  /// we change only body of the method. signature stays the same.
 // override methods in child class(es).
class Bank {
	double rateOfInterest() {
		return 0;
	}
}

class HSBC extends Bank{
	@Override
	double rateOfInterest() {
		return 10.5;
	}
}

class BOA extends Bank {
	double rateOfInterest() {
		return 12.5;
	}
}


public class MethodOverridingDemo {

	public static void main(String[] args) {
		
	HSBC hsbcObj = new HSBC();
	System.out.println(hsbcObj.rateOfInterest());
	
	BOA boaObj= new BOA();
	System.out.println(boaObj.rateOfInterest());
	
	}
}
