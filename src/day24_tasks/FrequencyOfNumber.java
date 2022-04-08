package day24_tasks;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};
        int frequency=freqOfNumber(array,1);
        System.out.println(frequency);
    }
    public static int freqOfNumber(int[] arr,int number){
        int count=0;
        for (int i : arr) {
            if(i==number)
                count++;
        }
        return count;
    }
}
// 5. create method that accepts one integer array and one integer number and returns the frequency of the number
//                        int[] array ={1,1,1,1,1,2,2};
//                        frequency(array, 1) ==> 5