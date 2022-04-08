package day24_tasks;

public class ReverseString {
    public static void main(String[] args) {
        String str="Java";
        String reverse=reverse(str);
        System.out.println(reverse);

    }
    public static String reverse(String str){
        String reverse="";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse;
    }
}
//3. create a method named reverse that passes one string parameter, the method can return the reversed string
//					str = "Java";
//					reverse(str) ==> avaJ