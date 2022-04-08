package day24_tasks;

public class Palindrome {
    public static void main(String[] args) {
        String str="level";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String word){
        String reverse=ReverseString.reverse(word);
        boolean isPalindrome=reverse.equals(word);
        return isPalindrome;
    }
}






//4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false
//					str = "Level"
//					isPalindrome(str) ===> true