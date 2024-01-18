package javaTask_E_day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example_B {
	
//	You are building a login system for a web site using Java. 
//	If the user enters an incorrect password, 
//	you want to display a message informing them of the error. 
//	How would you use exception handling to handle this situation?
//	
	
public void login_page() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter username ");
	String username = scan.next();
	System.out.println("Enter password ");
	String password = scan.next();
	String actualpassword ="Adse9566@";	  
	
		if (password.equals(actualpassword)) {
			System.out.println("Lgin Successfully please wait few seconds for fetch your data");
		
		}
		else {
			try {
				System.out.println(" your password is incorrect ");
				}
			finally{
			System.out.println(" Please enter valid password \n (or) \n Forgor password");
					}
			  }
							}
public static void main(String[] args) {
	Example_B  ex= new Example_B();
	ex.login_page();
	
}
}
