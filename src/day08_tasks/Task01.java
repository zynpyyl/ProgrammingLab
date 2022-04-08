package day08_tasks;

public class Task01 {
    public static void main(String[] args) {
        /*1. Given a number (byte) age, write a program that can check if the person
        is eligible to buy Cigarettes
        */
        byte age=15;
        boolean isEligible=age>=18;
        if (isEligible){
            System.out.println("He is eligible");
        }
        if (!isEligible){
            System.out.println("He is not eligible");
        }

    }
}
