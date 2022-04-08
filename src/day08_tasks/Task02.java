package day08_tasks;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        /*2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
         */
        byte grade;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the grade:");
        grade=scan.nextByte();
        boolean isElemantary=grade>=1 && grade<=5;
        boolean isMiddle=grade<=8 && !isElemantary;
        boolean isHigh=grade<=12 && !isElemantary && !isMiddle;
        boolean isCollege=grade<=16 && !isElemantary && !isMiddle && !isHigh;
        boolean isGrad=grade>=17;
        if (isElemantary){
            System.out.println("Elementary School");
        }
        if (isMiddle){
            System.out.println("Middle School");
        }
        if (isHigh){
            System.out.println("High School");
        }
        if (isCollege){
            System.out.println("College");
        }
        if (isGrad){
            System.out.println("Grad School");
        }

    }
}
