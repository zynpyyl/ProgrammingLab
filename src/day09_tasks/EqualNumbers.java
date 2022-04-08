package day09_tasks;
import java.util.*;

public class EqualNumbers {
    public static void main(String[] args) {
        /*
6. Create a class called EqualNumbers, and write a program that can check the equality of the
three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
         */
        Scanner scan=new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("3 numara giriniz:");
        n1=scan.nextInt();
        n2=scan.nextInt();
        n3=scan.nextInt();
        String statement;
        if (n1==n2&&n2==n3){
            statement="all equal";
        }else if (n1==n2){
            statement="n1&n2 are equal";
        }else if (n2==n3){
            statement="n2&n3 are equal";
        }else if (n3==n1){
            statement="n3&n1 are equal";
        }else{
            statement="none of them are equal";
        }
        System.out.println(statement);
    }
}
