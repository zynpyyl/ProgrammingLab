package day09_tasks;

public class NumberToWord {
    public static void main(String[] args) {
        /*1. Create a class called NumberToWord,
        and write a java program that can convert numbers
        between 0 ~ 9 to words
			Ex:
				number = 1;
			output:
				One
          */

        int num=8;
        String word;
        if (num==0){
            word="Zero";
        } else if (num==1){
            word="One";
        } else if (num==2){
            word="Two";
        } else if (num==3){
            word="Three";
        }else if (num==4){
            word="Four";
        }else if (num==5){
            word="Five";
        }else if (num==6){
            word="Six";
        }else if (num==7){
            word="Seven";
        }else if (num==8){
            word="Eight";
        }else if (num==9){
            word="Nine";
        }else{word="Out of range";}

        System.out.println(num+" = "+word);
    }
}
