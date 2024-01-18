package javaTask_E_day12;

import java.util.Scanner;

public class Example_A {
//	Write a Java program that reads user input for two integers and
//	performs division. Handle the exception that is thrown when the
//	second number is zero, and display an error message to the user.
	int num1;
	int num2;
	int num3;
	public void arithmaticExceptionex() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number dividend number - ");
		num1 = scan.nextInt();
		System.out.println("Enter the divider number - ");
		num2 = scan.nextInt();
		try {
			num3 = num1/num2;
			System.out.println("num3");
	}
	catch(ArithmeticException e) {
		System.out.println("Any number can't devided by ZERO ");
		System.out.println("Please enter another number to proceed");
		num2 = scan.nextInt();
		
		num3 = num1/num2;
		System.out.println(num3);
		}
	}
	public static void main(String[] args) {
		Example_A ex = new Example_A();
		ex.arithmaticExceptionex();
	}
}
