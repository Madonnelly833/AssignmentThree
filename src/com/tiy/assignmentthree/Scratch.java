package com.tiy.assignmentthree;

public class Scratch {

	public static void main(String[] args) {

		for (int i = 1; i <= 110; i++) {

			if (divisableByAllThree(i)) {
				System.out.println("FizzBuzzBang");

			} else if (divisableByThreeAndFive(i)) {
				System.out.println("FizzBuzz");

			} else if (divisableByFiveAndSeven(i)) {
				System.out.println("BuzzBang");
			} else if (divisableByThreeAndSeven(i)) {
				System.out.println("FizzBang");
			} else if (divisableByOnlyThree(i)) {
				System.out.println("Fizz");
			} else if (divisableByOnlyFive(i)) {
				System.out.println("Buzz");
			} else if (divisableByOnlySeven(i)) {
				System.out.println("Bang");
			} else {
				System.out.println(i);
			}

		}
	}

	public static boolean divisableByAllThree(int fromTheForLoop) {

		if (((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 5) == 0) && ((fromTheForLoop % 7) == 0)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean divisableByThreeAndFive(int fromTheForLoop) {

		if (((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 5) == 0)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean divisableByFiveAndSeven(int fromTheForLoop) {

		if (((fromTheForLoop % 5) == 0) && ((fromTheForLoop % 7) == 0)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean divisableByThreeAndSeven(int fromTheForLoop) {

		if (((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 7) == 0)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean divisableByOnlyThree(int fromTheForLoop) {

		if ((fromTheForLoop % 3) == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean divisableByOnlyFive(int fromTheForLoop) {

		if ((fromTheForLoop % 5) == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean divisableByOnlySeven(int fromTheForLoop) {

		if ((fromTheForLoop % 7) == 0) {
			return true;
		} else {
			return false;
		}

	}

}
