package day27_tasks;

public class RetrieveCharacters {
    public static void main(String[] args) {
        String str="Wooden S2po3on!";
        String letters="", digits="", specialChars="";
        for (char ch : str.toCharArray()) {
            if(Character.isDigit(ch))
                digits+=ch;
            else if(Character.isLetter(ch))
                letters+=ch;
            else
                specialChars+=ch;
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}






//3. Write a program that can retrieve the letters, digits and special characters from the string
//			str = "Wooden Spoon!"
//		output:
//			letters= "WoodenSpoon";
//			Digits = "";
//			specialChars = " !";