package day08_tasks;
import java.util.*;


public class Task03 {
    /*
    3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal
		Ex:
				n1= 100, n2 = 200;
		output:
				200 is maximum number
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Iki sayi giriniz:");
        int n1,n2;
        n1=scan.nextInt();
        n2= scan.nextInt();
        if (n1>n2){
            System.out.println(n1+" is maximum number");
        }
        if (n2>n1){
            System.out.println(n2+" is maximum number");
        }
        if (n1==n2){
            System.out.println(n1+" is equal to "+n2);
        }

}






    }