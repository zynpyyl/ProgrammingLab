package day13_tasks;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a three letter word:");
        String word=scan.next();
        int len=word.length();
        if(len>3){
            System.out.println("Word is too long");
        }else if(len<3){
            System.out.println("Word is too short");
        }else if(word.charAt(1)=='a'){
            System.out.println("Cool word");
        }else{
            System.out.println("Okay word");
        }
    }
}
//6. write a program that asks the user enter a three letter word. Check if the middle character
// of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter
// is not 'a' print: "Okay word".
//     - If the user does not enter a 3 letter word tell them:
//             If the word is less than 3 letters: "Word is too short"
//             If the word is too long: "Word is too long"