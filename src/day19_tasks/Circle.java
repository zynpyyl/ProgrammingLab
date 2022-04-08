package day19_tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the radius of the circle:");
            double r = scan.nextDouble();
            if (r <= 0) {
                System.err.println("Invalid entry for the radius of the circle.");
                System.exit(0);
            }
            System.out.println("diameter = " +(2*r));
            System.out.println("area = " + 3.14*r*r);
            System.out.println("perimeter = " + 2*3.14*r);

            System.out.println("Would you like to calculate another circle?");
            String a = scan.next();

            if (a.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }
            while (!(a.equalsIgnoreCase("no") || a.equalsIgnoreCase("yes"))) {
                System.err.println("Invalid entry. Please re-enter");
                a= scan.next();
            }
        }
    }
}
/*	1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry




 */