package com.controlstatement;

public class NestedIf {
	public static void main(String[] args) {
//nested if: if inside if condition when inner if condition will excute when outer if condition is true
		int age = 12;
		int wt = 60;
		if (age >= 18) {
			if (wt > 50) {
				System.out.println("you are eligible to donate blood");
			} else {
				System.out.println("you are not eligible to donate blood");
			}

		} else {
			System.out.println("age should be greater than 18");
		}
	}
}
