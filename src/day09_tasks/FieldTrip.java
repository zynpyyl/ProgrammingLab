package day09_tasks;

public class FieldTrip {
    public static void main(String[] args) {
        /*
        8. Create a class called FieldTrip. Your school goes on a Field trip each year.
        The place you go will be based on your grade. Given a variable gradeNumber (1-6)
        figure out the details of your field trip. Print the information at the end.
    Data based on grade:
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
         */

        int grade=6;
        String tripDetails;
        if (grade==1){
            tripDetails="location -  Apple orchard\nnumber of groups - 3\nteacher in charge - Ms. Smith";
        }else if (grade==2){
            tripDetails="location - Zoo\nnumber of groups - 7\nteacher in charge - Mr. Lee";
        }else if (grade==3){
            tripDetails="location - Aquarium\nnumber of groups - 5\nteacher in charge - Ms. Wilson";
        }else if (grade==4){
            tripDetails="location - Movie theater\nnumber of groups - 2\nteacher in charge - Ms. Reyes";
        }else if (grade==5){
            tripDetails="location - Museum\nnumber of groups - 5\nteacher in charge - Ms. Lela";
        }else{
            tripDetails="location - Six Flags\nnumber of groups - 8\nteacher in charge - Mr. Watt";
        }
        System.out.println(tripDetails);



    }
}
