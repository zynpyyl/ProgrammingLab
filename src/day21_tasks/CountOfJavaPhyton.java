package day21_tasks;

import java.util.Arrays;

public class CountOfJavaPhyton {
    public static void main(String[] args) {
        String sentence="Java Java Phyton C# Java Phyton";
        String[] str=sentence.split(" ");
        System.out.println(Arrays.toString(str));
        int countJava=0, countPhyton=0;
        for (String s : str) {
            if (s.equals("Java"))
                countJava++;
            else if (s.equals("Phyton"))
                countPhyton++;
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPhyton = " + countPhyton);
    }
}
//	6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
//	(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)