package day16_tasks;
import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two positive numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int mult=0;
        if(num1>=0&&num2>=0){
            for (int i = 0; i < num1; i++) {
                mult += num2;
            }
            System.out.println(num1 + "*" + num2 + "=" + mult);
        }else
            System.out.println("invalid");
        scan.close();
    }
}
//3. Write a program that asks user to enter two positive numbers,
//     then multiply those two numbers without using multiplication (*) operator.
//        if user enters any negative numbers, print Invalid
//                inputs:
//                    10
//                    20
//                output:
//                    200