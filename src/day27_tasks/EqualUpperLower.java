package day27_tasks;

public class EqualUpperLower {
    public static void main(String[] args) {
    String str="hksdha234JKSDHD";
    int upper=0,lower=0;
        for (char c : str.toCharArray()) {
            if(Character.isUpperCase(c))
                upper++;
            if(Character.isLowerCase(c))
                lower++;
        }
        System.out.println(upper==lower);
}
}








//4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
//		Ex:
//			str = "JAVA java";
//		output:
//			true