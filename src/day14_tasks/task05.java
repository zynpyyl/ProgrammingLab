package day14_tasks;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        scan.close();
        char x=word.charAt(0);
        if(x>='a'&&x<='z'){
            System.out.println("first character is lowercase letter");
        }else if(x>='A'&&x<='Z'){
            System.out.println("first character is uppercase letter");
        }else if(x>='0'&&x<='9'){
            System.out.println("first character is digit");
        }else{
            System.out.println("first character is special character");
        }
    }
}

//    5. Ask user to enter a word,
//        if the word starts with digits, print "first character is digit"
//        if the word starts with uppercase letters, print "first character is lowercase letter"
//        if the word starts with lowercase letters, print "first character is uppercase letter"
//        if the word starts with special characters, print "first character is special character"
//
//
//        HINT: 1. you need charAt() method
//              2. Ascii Table