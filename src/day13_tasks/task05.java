package day13_tasks;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1= scan.nextLine();

        if(s1.isEmpty()){
            System.out.println("String is empty");
        }else if(s1.length()>3){
            System.out.println(""+s1.charAt(s1.length()-3)+s1.charAt(s1.length()-2)+s1.charAt(s1.length()-1));
            System.out.println(s1.substring(s1.length()-3));
        }else{
            System.out.println(s1);
        }



    }
}
//5. Write a method that asks user to enter a string.
//        if the string is empty, print: string is empty
//        if the string has more than 3 characters, print the last three characters
//        if the string has less than or equal 3 characters, print the string itself