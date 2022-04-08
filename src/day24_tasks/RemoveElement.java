package day24_tasks;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int index = 4;
        System.out.println(Arrays.toString(removeElement(arr, index)));
    }
    public static int[] removeElement(int[] arr, int index) {
        int[] arr2 = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                arr2[j] = arr[i];
                j++;
            }
        }
        return arr2;
    }
}

// Create a method named removeElement that passes one integer array and one integer,
// the method removes the integer index from the integer array and returns the new array
//			Ex:
//				array = {10, 20, 30, 40, 50, 60}
//				index = 2
//				removeElement(array, index) ==== {10, 20, 40, 50, 60}