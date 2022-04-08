package day10_tasks;

public class Grade {
    public static void main(String[] args) {
        /*
3. Create a class called Grade, a char variable named grade is given. write a program
to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
        char grade='H';
        String result=(grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='F')? (grade=='A')? "excellent"
        :(grade=='B')? "great job" :(grade=='C')? "good" :(grade=='D')? "passed" : "failed" : "invalid";
        System.out.println(result);

    }
}
