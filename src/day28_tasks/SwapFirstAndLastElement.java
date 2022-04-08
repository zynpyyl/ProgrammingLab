package day28_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapFirstAndLastElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        int temp=list.get(0);
        int lastElement=list.get(list.size()-1);
        list.set(0,lastElement);
        list.set(list.size()-1,temp);
        System.out.println(list);

    }
}


//2. write a program that can swap the first and last elements of an integer arraylist
//	                list = [1,2,3,4,5];
//	                output: [5,2,3,4,1];