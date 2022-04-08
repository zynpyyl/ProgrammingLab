package day23_tasks;

public class printFullName {
    public static void main(String[] args) {

        printFullName("zEynep YAYla");

    }
    public static void printFullName(String fullName){
        String[] arr=fullName.toUpperCase().split(" ");
        fullName=arr[0].charAt(0)+arr[0].substring(1).toLowerCase()+" "+arr[1].charAt(0)+arr[1].substring(1).toLowerCase();
        System.out.println(fullName);

    }

}


//	16.  write a method that can print out the full name of a person in regular format
//            ex:
//               fullName("cYdEo", "SCHOOL");
//                output:
//                    "Cydeo School"