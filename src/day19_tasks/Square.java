package day19_tasks;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while(true){
            System.out.println("Enter the side of the square:");
            int side= scan.nextInt();
            if(side<=0){
                System.out.println("Invalid Entry for the side of the square");
                break;
            }
            System.out.println("Area: "+ side*side);
            System.out.println("Perimeter: "+side*4);

            System.out.println("Would you like to calculate another Square?");
            String a= scan.next().toLowerCase();

            while(!(a.equals("yes")||a.equals("no"))){
                System.err.println("Invalid entry.Please re-enter.");
                a= scan.next().toLowerCase();
            }
            if(a.equals("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }
        }




    }
}

/*
2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry





 */