package day18_tasks;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str= scan.nextLine();
        String word="";

        for (int i = 0; i <str.length() ; i++) {
            if(!word.contains(str.charAt(i)+"")){
                word+=str.charAt(i);
            }
        }

        for (int i = 0; i < word.length() ; i++) {
            int freq=0;
            for (int j = 0; j < str.length() ; j++) {
                if(word.charAt(i)==str.charAt(j)){
                    freq++;
                }
            }
            System.out.print(""+word.charAt(i)+freq);
        }
    }
}
//4. Write a program that can find the frequency of the characters from a string
//                        str = "aabcccd";
//                        output:
//                                a2b1c3d1
//            Hint: if you find out how to find the frequency of one character,
//            then repeat it for all the remaining characters