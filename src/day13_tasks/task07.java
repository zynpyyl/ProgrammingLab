package day13_tasks;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 3 words:");
        String str1=scan.next();
        String str2=scan.next();
        String str3=scan.next();
        if(str1.length()== str2.length()&&str2.length()==str3.length()){
            System.out.println("All words are same length");
        }else if(str1.length()!=str2.length()&&str2.length()!=str3.length()&&str1.length()!=str3.length()){
            System.out.println("All different length");
        }else {
            System.out.println("Not Same nor Different lengths");
        }

    }
}
//7. Write a program  for CheckWords, the program accepts 3 words and :
//            - if they are same length:  print "All words are same length"
//            - if some same length and others not:    print "Not Same nor Different lengths"
//            - if all different length :  print "All different length"