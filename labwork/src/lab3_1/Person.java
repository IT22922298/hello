package lab3_1;

public class Person {
    String name, address;
    //parameter constructor
    public Person(String newName,String newAddress) {
    	name = newName;
    	address = newAddress;
    }
    
    //method implementation
    void showDetails() {
    	System.out.println("My name is "+name+ "\nI am from "+address);
    }
	

}
