package operators;

import java.util.Random;
import java.util.Scanner;

/*
create a class named LeapYear, and write a program that can identify if the given year is leap Year,
print true if it's leap year, otherwise print false
	        Ex:
	             if  year = 2020
	            output:
	                2020 is leap year: true
        Hint: if the number of year can be evenly divisible by 4 (with remainder of zero),
        it's leap year
 */
public class LeapYear {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int year;
        System.out.println("Yili giriniz: ");
        year= scan.nextInt();
        boolean leapYear=year%4==0;
        System.out.println(year+" is leapYear : " + leapYear);


    }
}
