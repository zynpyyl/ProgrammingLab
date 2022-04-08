package day24_tasks;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr1={3,5,8,1,2,6,9};
        int minimum=minNumber(arr1);
        System.out.println(minimum);


    }

    public static int minNumber(int[] arr){
        int min=arr[0];
        for (int each : arr) {
            if(each<min)
                min=each;
        }
        return min;
    }


}
