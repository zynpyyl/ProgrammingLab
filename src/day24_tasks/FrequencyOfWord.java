package day24_tasks;

import java.util.Locale;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java java java python python";
        String word = "java";
        int frequency=frequencyOfWord(sentence,word);
        System.out.println(frequency);
    }

    public static int frequencyOfWord(String sentence,String word){

        String str=sentence.toLowerCase().replace(word.toLowerCase(),"");
        int frequency=(sentence.length()-str.length())/word.length();

        return frequency;
    }
}
//	1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
//                Ex:
//                    sentence = "Java java java python python"
//                    word = "java";
//                    frequencyOfWord(sentence, word) ==>  3