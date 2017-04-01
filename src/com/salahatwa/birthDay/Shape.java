package com.salahatwa.birthDay;

public class Shape {

	public static void rectangle(int rows, int cols) {

		// Loop through the rows

		for (int i = 0; i < rows; i++) {

			// Loop through the columns and print an asterisk for each column of
			// the row.

			for (int j = 0; j < cols; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

	public static void diamond(int rows) {
		// Start our spaces just like an equilateral triangle
		int spaces = rows - 1;

		// Loop through the rows
		for (int i = 0; i < rows; i++) {

			// Perpend spaces just like our equilateral triangle
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < (rows - spaces); j++) {
				System.out.print("* ");
			}
			System.out.println();

			spaces--;
		}

		// Restart the spaces at 1 and this time increase spaces to form bottom
		// half of diamond
		spaces = 1;

		for (int i = rows; i >= 0; i--) {
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < (rows - spaces); j++) {
				System.out.print("* ");
			}
			System.out.println();

			// Notice here we increase spaces so we decrease asterisks being
			// printed.
			spaces++;
		}
	}

	public static void rightTriangle(int rows) {
		// Find out our starting space count
		int spaces = rows - 1;

		// Loop through each row
		for (int i = 0; i < rows; i++) {
			// This row is going to print asterisks that is equal to the row
			// minus the spaces count
			for (int j = 0; j < (rows - spaces); j++) {
				System.out.print("*");
			}

			// New row
			System.out.println();

			// Decrease the space count so next row will have one more asterisk
			spaces--;
		}
	}

	public static void equilateralTriangle(int rows) {
		// Find the number of spaces for the row
		int spaces = rows - 1;

		// Loop through the rows
		for (int i = 0; i < rows; i++) {

			// Print the spaces in front of each row (similar to our left facing
			// right triangle)
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}

			// Here we are printing the asterisk with a space on the end for
			// nice equal formatting
			// But this still results in asterisk count which is the row minus
			// the spaces
			for (int j = 0; j < (rows - spaces); j++) {
				System.out.print("* ");
			}

			// Next row
			System.out.println();

			// Subtract the spaces
			spaces--;
		}
	}

	public static void main(String[] args) {

		// rightTriangle(5);

		// diamond(6);
		// equilateralTriangle(10);
		// rectangle(5, 5);
	}

}
