package lab3_1;

public class Student extends Person {
	String Stid;

	public Student(String newName, String newAddress, String newStid) {
		super(newName, newAddress);
		Stid = newStid;
		
	}
	void showDetails() {
		super.showDetails();
		System.out.println("My Id is "+Stid);
	}

}
