package day28_tasks;

import java.util.ArrayList;

public class MergeArraysToArrayList {
    public static void main(String[] args) {
        String[] str = {"A", "B", "C"};
        String[] str1 ={"D", "E", "F", "G"};

        ArrayList<String> list=new ArrayList<>();
        for (String s : str) {
            list.add(s);
        }
        for (String s : str1) {
            list.add(s);
        }
        System.out.println(list);
    }
}








//4. write a program that can combine two String arrays into one arrayList
//	            ex:
//	                arr1 = {"A", "B", "C"};
//	                arr2 = {"D", "E", "F", "G"};
//	                list ==> {"A", "B", "C", "D", "E", "F", "G"}