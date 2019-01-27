/*
 * 27.01.19 16:22 Created by Sergey Chernov.
 *  В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения.
 */

package Les05;

import java.util.Scanner;

public class SwapWords {

    static String swapWords(String string) {
        if (string == null || string.isEmpty()) return null;

        string = string.trim();
        int firstSpace = string.indexOf(" ");
        int lastSpace = string.lastIndexOf(" ");

        if (firstSpace >= 0 && lastSpace >= 0) {
            String firstWord = string.trim().substring(0, firstSpace);
            String middlePartSentences = string.substring(firstSpace, lastSpace + 1);
            String lastWord = string.substring(lastSpace + 1);
            return lastWord + middlePartSentences + firstWord;
        }
        else return string;
    }

    public static void main(String[] args) {
        System.out.println("Введите несколько предложений:");
        StringBuilder stringBuilder = new StringBuilder(new Scanner(System.in).nextLine());
        System.out.println(stringBuilder);
        String[] sentences = stringBuilder.toString().split("\\.");
        String[] swapedStrings = new String[sentences.length];

        for (int i = 0; i < sentences.length; i++) {
            swapedStrings[i] = swapWords(sentences[i]);
        }

        for (String s : swapedStrings) {
            System.out.println(s);
        }
    }
}
