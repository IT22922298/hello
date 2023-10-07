package version01;
import java.util.Scanner;

public class Employee {
	protected String Empid, name, address;
	
	Employee (String Empid, String name, String address){
		this.Empid = Empid;
		this.name = name;
		this.address = address;
	}
	Employee(){
		
	}
	public void Read() {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the Empid: ");
		this.Empid = input.nextLine();
		System.out.print("Enter the name: ");
		this.name = input.nextLine();
		System.out.print("Enter the address: ");
		this.address = input.nextLine();
	}
	public void Print() {
		System.out.println("The Empid: " + Empid);
		System.out.println("The Name: " + name);
		System.out.println("The Address: " + address);
	}
}
