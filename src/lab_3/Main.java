package lab_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Text textManager = new Text(text);

        System.out.println(textManager.countSentences() + " " +"sentences");
        System.out.println(textManager.countLetters() + " " +"letters");
        System.out.println(textManager.countVowels() + " " +"vowels");
        System.out.println(textManager.countConsonants() + " " +"consonants");
        System.out.println("The most frequent word is: " + textManager.getMostFrequentWord());
        System.out.println("Longest word is: " + textManager.getLongestWord());
    }
}
