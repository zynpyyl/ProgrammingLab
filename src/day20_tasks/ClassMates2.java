package day20_tasks;

public class ClassMates2 {
    public static void main(String[] args) {
        String[] classMates= {"Irfan","Burhan","Jale","Yasemin","Abdurrahman","Beyzanur","Azra","Ismet","Nihal","Omer"};

        for (int i = 0; i < classMates.length; i++) {
            String each=classMates[i];
            String reverse="";
            for (int i1 = each.length() - 1; i1 >= 0; i1--) {
                reverse+=each.charAt(i1);
            }
            System.out.println(reverse);
            }
}
}







//2. create string array, and store the names of your  class mates (10)
//            reverse each students names and print them in separate lines
//            	ex:
//            		arr = {java, python, c#}
//        		output:
//        			avaJ
//        			nohtyp
//        			#c