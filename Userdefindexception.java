package javaTask_E_day12;

import java.util.Scanner;

public class Userdefindexception {
	    public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the age - ");
			int age = scan.nextInt();
			
			try {
				
			if (age <= 18) {
				
				throw new InvalidAgeException();
				}
			
			}
			catch(InvalidAgeException e) {
				
				age =18;
				System.out.println("you entered invalid age, change the age");
			}
			
			
		}
	    
}
