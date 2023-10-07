package lab3;

public class Test {

	public static void main(String[] args) {

		//Sudent s1 = new Sudent("Vithuz","It22","Navaly");  //object
		//s1.name = "Vithuz";
		//s1.ditno= "It22";
		//s1.address = "Navaly";
		
		//Sudent s2 = new Sudent("Sharuk","It23","Kopay");
		//s2.name = "Sharuk";
		//s2.ditno= "It23";
		//s2.address = "Kopay";
		
		//Print the values
		//System.out.println("Name is: "+s1.name);
		//System.out.println("Ditno is: "+s1.ditno);
		//System.out.println("Address is: "+s1.address);
		
	/*	Sudent s1 = new Sudent(null, null, null);
		s1.setName("Vithuz");
		s1.setDitno("It22");
		s1.setAddress("Navaly");
		
		System.out.println("Name is: "+s1.getName());
		System.out.println("Ditno is: "+s1.getDitno());
		System.out.println("Address is: "+s1.getAddress());
		
		*/
		
		Sudent s1 = new Sudent(null, null, null);
		s1.setName("Vithuz");
		s1.setDitno("It22");
		s1.setAddress("Navaly");
		System.out.println(s1.getDetails());
		
	}

}
