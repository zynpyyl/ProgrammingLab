package day19_tasks;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true) {
            System.out.println("How much you make an hour?");
            double hourlyRate = scan.nextDouble();
            if (hourlyRate <= 0) {
                System.err.println("Invalid entry for Hourly Rate");
                break;
            }
            System.out.println("How many hours do you work per week?");
            int weeklyHours = scan.nextInt();
            if (weeklyHours < 1 || weeklyHours > 144) {
                System.err.println("Invalid entry for Weekly Hours");
                break;
            }
            System.out.println("Enter your state tax rate");
            double stateTaxRate = scan.nextDouble();
            if (stateTaxRate < 0 || stateTaxRate > 0.1) {
                System.err.println("Invalid entry for state tax rate");
                break;
            }
            double grossSalary = hourlyRate * weeklyHours * 52;
            double federalTax = grossSalary * 0.26;
            double stateTax = grossSalary * stateTaxRate;
            double totalTax = federalTax + stateTax;
            double netIncome = grossSalary - totalTax;

            System.out.println("grossSalary = " + grossSalary);
            System.out.println("federalTax = " + federalTax);
            System.out.println("stateTax = " + stateTax);
            System.out.println("totalTax = " + totalTax);
            System.out.println("netIncome = " + netIncome);;

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            if (a.equals("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            } else if (!(a.equals("yes"))) {
                System.err.println("Invalid entry");
                break;
            }


        }
    }
}

/*	5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"



 */