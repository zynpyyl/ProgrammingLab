package day23_tasks;

public class grade {
    public static void main(String[] args) {

        grade(85);

    }

    public static void grade(int score){

        char result=(score>=90)? 'A' :(score>=80)? 'B' :(score>=70)? 'C' :(score>=60)? 'D' : 'F' ;
        System.out.println(result);

    }

}

//5. create a method that can calculate the grade of the student based on the score