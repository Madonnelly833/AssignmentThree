package com.tiy.assignmentthree;

import java.util.Scanner;

public class WorkingWithCharArrays {

	public static void main(String[] args) {

		Scanner alien = new Scanner(System.in);

		System.out.println("How is your day?");

		String theDayIs = alien.nextLine();

		switch (theDayIs.toLowerCase()) {
		case "Good":
			System.out.println("Who asked you?");
			break;
		case "Bad":
			System.out.println("Go fuck yourself");
		default:
			System.out.println("Huh?");
			break;
		}
	}

}