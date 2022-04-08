package operators;

public class Task1 {
    public static void main(String[] args) {
        /* 1. write a program that can swipe two variables' value by using a temporary variable
        Ex:
		   if a= 10, b=15
           output:
		        a = 15
		        b = 10            */

        int a=10,b=15,c=a;

        a=b;
        b=c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("---------------");

        int x=10,y=20;
        System.out.println("x = " + y);
        System.out.println("y = " + x);





    }



}
