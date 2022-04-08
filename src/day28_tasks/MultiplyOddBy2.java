package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddBy2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if(i%2==1)
                result.add(i*2);
        }
        System.out.println(result);
    }
}








//3. write a program that can multiply each odd number by 2
//	            ex: list = [1,2,3,4,5];
//	                output: [2,2,6,4,10]