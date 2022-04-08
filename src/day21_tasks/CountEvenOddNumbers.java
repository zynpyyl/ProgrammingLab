package day21_tasks;

public class CountEvenOddNumbers {
    public static void main(String[] args) {
        int[] numbers={3,55,73,81,79,32};

        int countEven=0;

        for (int number : numbers) {
            if(number%2==0)
                countEven++;
        }
        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + (numbers.length-countEven));
    }
}

//2. Write a program that can count the even and odd number from an array of integers
//			Note: MUST use for each loop