package day09_tasks;

public class CharacterIdentity {
    public static void main(String[] args) {
        /*
        4. Create a class called Character Identity, and write a program that can identify
        if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character
        	Ex:
			ch = '@'
        	output:
			Special Character
		HINT: You may wanna check out the numbers of the chracters on ASCII table
         */
        char a='5';
        int num=a;
        if (num>=65&&num<=90||num>=97&&num<=122){
            System.out.println("Alphabetic Character");
        }else if (num>=48&&num<=57){
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }






    }





}
