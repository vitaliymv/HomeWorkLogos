package javacoreten;

import java.util.Arrays;

public class MostPopularWordInSentence {

    public static void main(String[] args) {

        Data data = new Data();
        String word = "";
        String maxWord = "";
        int count = 1;
        int maxCount = 0;

        String[] text = data.popularSentence.split(" ");
        Arrays.sort(text);

        for (String s : text) {
            if (s.equalsIgnoreCase(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = s;
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxWord = word;
        }

        System.out.println("Most popular word in sentence: " + maxWord.toLowerCase() +
                "\nThis word is found: " + maxCount + " times");
    }

}
