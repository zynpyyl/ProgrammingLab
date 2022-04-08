package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicatedElement {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,1,4,5,6,7,7));
        for (Integer a: list) {
            int frequency=0;
            for (Integer b: list) {
                if (a == b)
                    frequency++;
                if (frequency > 1) {
                    System.out.println(a);
                    System.exit(0);
                }
            }
        }
    }
}







//7. Write a program that can return the first duplicated element from an arrayList of Integer
//			list = [1,2,2,3,4,4,5,6,7,7];
//			output:
//				2