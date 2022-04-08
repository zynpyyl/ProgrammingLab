package day10_tasks;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        /*1. Create a class called GradeLevel, Given a number(byte) grade level determine
        and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given  */
        Scanner scan=new Scanner(System.in);
        System.out.println("Grade Level: ");
        byte grade=scan.nextByte();
        String school;
        if (grade<=18&&grade>0){
            school=(grade<=5)? "Elementary School" :(grade<=8)? "Middle School" :(grade<=12)?
                    "High School" :(grade<=16)? "College" : "Grad School";
        }else{
            school="Invalid grade level given";
        }

        System.out.println(school);









    }
}
