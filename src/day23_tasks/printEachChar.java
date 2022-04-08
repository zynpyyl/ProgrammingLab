package day23_tasks;

public class printEachChar {

    public static void main(String[] args) {

        printEachChar("I love Java");


    }

    public static void printEachChar(String word){

        for (int i = 0; i < word.length() ; i++) {

            System.out.println(word.charAt(i));

        }


    }
}

//13. create a method named printEachChar that can print each characters of a string