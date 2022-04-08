package day15_tasks;

import java.util.Scanner;

public class CharsOfWord {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String word= new Scanner(System.in).nextLine();
        String letter="";
        String digits="";
        String special_chars="";
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
                letter+=ch;
            }else if(ch>='0'&&ch<='9'){
                digits+=ch;
            }else if(ch!=' '){
                special_chars+=ch;
            }

        }
        System.out.println("letters = " + letter);
        System.out.println("digits = " + digits);
        System.out.println("special_chars = " + special_chars);


    }
}
//    5. write a program that can retrieve the digits, letters and special characters from a string.
//                input:
//                    mn@#123Ab!
//                output:
//                    letters: mnAb
//                    digits: 123
//                    special chars: @#!