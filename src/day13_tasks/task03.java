package day13_tasks;

public class task03 {
    public static void main(String[] args) {
        String s1="level";
        char first=s1.charAt(0);
        char last=s1.charAt(s1.length()-1);
        if(first==last){
            System.out.println("same");
        }




    }
}
//3. write a program that can check if the first and last characters of the string are same
//            ex:
//                level
//            output:
//                same