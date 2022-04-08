package day23_tasks;

public class OddEvenNumbers1To100 {
    public static void main(String[] args) {

        oddNumbers1to100();

        System.out.println();

        evenNumbers1to100();

    }

    public static void oddNumbers1to100(){

        for (int i = 1; i <100 ; i+=2) {
            System.out.print(i+" ");
        }
    }

    public static void evenNumbers1to100() {
        for (int i = 2; i < 100; i += 2) {
            System.out.print(i + " ");
        }
    }

}
//1. create a method that can print odd numbers between 1~100 in a same line saperated by space
//2. create a method that can print even numbers between 1~100 in a same line saperated by space
