package lab06;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
    	
        // Create an Integer ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Check if the ArrayList is empty
        if (arrayList.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } 
        else {
            System.out.println("ArrayList is not empty.");
            
            // Add 10 numbers from keyboard input
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int number = scanner.nextInt();
                arrayList.add(number);
            }
            
            scanner.close();
            
            // Calculate the total
            int total = 0;
            System.out.print("Numbers in the ArrayList: ");
            
            for (Integer num : arrayList) {
                System.out.print(num + " ");
                total += num;
            }
            
            System.out.println();
            
            // Print the total
            System.out.println("Total of the numbers: " + total);
        }
    }
}
