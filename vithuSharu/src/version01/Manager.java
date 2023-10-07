package version01;
import java.util.Scanner;

public class Manager extends Employee {
			String Department;
			String ProductNo1;
			String ProductNo2;
			String ProductNo3;
			Manager(String Empid, String name, String address, String Department, String ProductNo1, String  ProductNo3, String ProductNo2){
				super(Empid, name, address);
				this.Department = Department;
				this.ProductNo1 = ProductNo1;
				this.ProductNo2 = ProductNo2; 
				this.ProductNo3 = ProductNo3;		
			}
			Manager(){
				
			}
			public void Read1() {
				Scanner input = new Scanner(System.in);
				super.Read();
				System.out.print("Enter the department id: "+Department);
				Department = input.nextLine();
				
				try {
					System.out.print("Enter the Product 1: "+ProductNo1);
					ProductNo1 = input.nextLine();
					System.out.print("Enter the Product 2: "+ProductNo2);
					ProductNo2 = input.nextLine();
					System.out.print("Enter the Product 3: "+ProductNo3);
					ProductNo3 = input.nextLine();
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
			public void Print() {
				System.out.println("The Department is: "+Department);
				System.out.println("The Producr 1: "+ProductNo1);
				System.out.println("The Producr 3: "+ProductNo2);
				System.out.println("The Producr 3: "+ProductNo3);
			}
			public void Read() {
				// TODO Auto-generated method stub
				
			}
			
		}
