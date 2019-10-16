package lab3;

import java.util.*;

public class Text {

    String text;
    char[] textArray;
    int sentenceCount = 0;
    int vowelCount = 0;
    int letterCount = 0;
    int consonantCount = 0;

    public Text(String text) {
        this.text = text;
        this.textArray = this.text.toCharArray();
    }

    public int countSentences() {
        for (int i = 0; i < this.textArray.length; i++) {

            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!') {
                sentenceCount++;
            }

        }
        return sentenceCount;
    }

    public int countLetters() {
        for (int i = 0; i < this.textArray.length; i++) {
            if (textArray[i] <= 90 && textArray[i] >= 65
                    || textArray[i] <= 122 && textArray[i] >= 97) {
                letterCount++;
            }
        }
        return letterCount;
    }

    public int countVowels() {
        text = text.toLowerCase();
        for (int i = 0; i < this.textArray.length; i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public int countConsonants() {
        return (countLetters() - countVowels()) / 2;
    }

    public String getLongestWord() {
        String[] words = this.text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        int index = 0;
        int elementLength = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > elementLength) {
                index = i;
                elementLength = words[i].length();
            }
        }
        return words[index];
    }

    String getMostFrequentWord() {

        String[] arr = this.text.split("\\s+");
        HashMap<String, Integer> hs = new HashMap<String, Integer>();

        for (int i = 0; i < arr.length; i++) {

            if (hs.containsKey(arr[i])) {
                hs.put(arr[i], hs.get(arr[i]) + 1);
            } else {
                hs.put(arr[i], 1);
            }
        }

        Set<Map.Entry<String, Integer>> set = hs.entrySet();
        String key = "";
        int value = 0;

        for (Map.Entry<String, Integer> me : set) {
            if (me.getValue() > value) {
                value = me.getValue();
                key = me.getKey();
            }
        }
        return key;
    }
}

