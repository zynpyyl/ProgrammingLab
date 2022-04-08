package day27_tasks;

import java.util.Arrays;

public class InsertMethod2 {

    public static int[] insert(int[] arr, int index, int element) {
        int[] arr1 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index)
                arr1[i] = arr[i];
            else if (i == index)
                arr1[i] = element;
            else
                arr1[i] = arr[i - 1];
        }
        return arr1;
    }
}

