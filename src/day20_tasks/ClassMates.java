package day20_tasks;

public class ClassMates {
    public static void main(String[] args) {
        String[] classMates= {"Irfan Bayar","Burhan Ayar","Jale Yar","Yasemin Zor","Abdurrahman Kolay","Beyzanur Yilmaz","Azra Nur","Ismet Ozhan","Nihal Karaca","Omer Duzgun"};
        String initial="";
        for (int i = 0; i < classMates.length; i++) {
            initial=""+classMates[i].charAt(0)+classMates[i].charAt(classMates[i].indexOf(" ")+1);
            System.out.println(initial);
        }

    }
}





//1. create an array named classmates, and store 10 of your classmates' full names
//            print the initials of each classmates in separate lines