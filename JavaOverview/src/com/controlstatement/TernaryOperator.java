package com.controlstatement;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
//ternary operator
		System.out.println("Enter a no.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = (n % 2 == 0) ? "Even" : "Odd";
		System.out.println(result);

	}
}
