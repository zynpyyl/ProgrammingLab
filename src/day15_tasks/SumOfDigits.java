package day15_tasks;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        String word=new Scanner(System.in).next();
        int sumOfDigits=0;
        for (int i = 0; i <word.length() ; i++) {
            char ch=word.charAt(i);
            if(ch>='0'&&ch<='9'){
                sumOfDigits+=ch-48;
            }
        }
        System.out.println("sumOfDigits = " + sumOfDigits);;
    }
}


//6. Write a program that can return the sum of digits from a  string
//             Ex:
//                 input: A1B2C3
//                 output:    6
//             Hint: You need to get each of the character by using a loop
//	             	To convert char to number:
//						             	   '0' - 48   ==> 0
//						             	   '1' - 48   ==> 1
