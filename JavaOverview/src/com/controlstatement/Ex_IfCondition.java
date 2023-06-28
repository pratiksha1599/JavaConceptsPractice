package com.controlstatement;

import java.util.Scanner;

public class Ex_IfCondition {
	public static void main(String[] args) {

		//int a = 18;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		if (n%2==0) {
			System.out.println("No is even");

		}
		else {
			System.out.println("No is odd");
		}
	}

}
