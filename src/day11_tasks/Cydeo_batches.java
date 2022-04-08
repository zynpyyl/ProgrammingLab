package day11_tasks;

public class Cydeo_batches {
    public static void main(String[] args) {
/*4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.
            If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"
         	NoteSolution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed */
        String batch="EU";
        String calender;
        if(batch=="US morning"){
            calender="Class times are 10-5 EST. M, T, Th, F.";
        }else if (batch=="US evening"){
            calender="Class times are 7-10 EST. M, T, W, Th, S, S";
        }else if (batch=="EU"){
            calender="Class times are  10-5 EST. M, T, W, Th, F.";
        }else{
            calender="Invalid Batch";
        }
        System.out.println(calender);

        System.out.println("---------------------");

        switch (batch){
            case("US morning"):
                calender="Class times are 10-5 EST. M, T, Th, F.";
                break;
            case("US evening"):
                calender="Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case("EU"):
                calender="Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                calender="Invalid Batch";
        }
        System.out.println(calender);

        System.out.println("---------------------");

        if (batch=="US morning"||batch=="US evening"||batch=="EU"){
            switch (batch){
                case("US morning"):
                    calender="Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case("US evening"):
                    calender="Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    calender="Class times are  10-5 EST. M, T, W, Th, F.";
            }}else{
                calender="Invalid Batch";
            }
            System.out.println(calender);

    }
}
