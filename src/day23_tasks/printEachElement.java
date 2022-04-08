package day23_tasks;

public class printEachElement {
    public static void main(String[] args) {

        eachElement(new int[]{3, 5, 7, 9});


    }

    public static void eachElement(int[] arr){
        for (int each : arr) {
            System.out.println(each);
        }

    }
}
//14. create a method named printEachElement that can print each elements of an integer array