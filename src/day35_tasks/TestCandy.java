package day35_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCandy {
    public static void main(String[] args) {

        Candy[] candies = {new Candy("Albeni", 3, 5, false), new Candy("Hosbes", 2, 8, false),
                new Candy("Maximus", 1, 10, true), new Candy("Hobby", 3, 0, false)};
        ArrayList<Candy> candies1=new ArrayList<>(Arrays.asList(candies));
        for (Candy candy : candies1) {
            System.out.println(candy.getBrand());
            System.out.println(candy.getPrice());
        }

    }
}
