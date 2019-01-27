/*
 * 27.01.19 18:15 Created by Sergey Chernov.
 * Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.
 */

package Les05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortSentences {

    public static void main(String[] args) {
        String str = "Каждый разработчик забирает и публикует изменения (pull & push) в origin. " +
                "Но, помимо централизованных отношений push-pull, каждый разработчик также может забирать изменения от остальных коллег внутри своей микро-команды. " +
                "Еще одно короткое предложение. Например, этот способ может быть удобен в ситуации, когда двое или более разработчиков работают вместе над большой новой фичей, но не могут издать незавершённую работу в origin раньше времени. " +
                "Короткое предложение. " +
                "На картинке выше изображены подгруппы Алисы и Боба, Алисы и Дэвида, Клэр и Дэвида.";
        System.out.println(str);

        String[] sentences = str.split("\\.");
        StringBuilder[] strings = new StringBuilder[sentences.length];

        System.out.println("\nИсходный набор предложений:");
        for (int i = 0; i < sentences.length; i++) {
            strings[i] = new StringBuilder(sentences[i].trim());
            System.out.println(sentences[i]);
        }
        Arrays.sort(strings, new Comparator<StringBuilder>() {
            @Override
            public int compare(StringBuilder o1, StringBuilder o2) {
                String sentence1 = o1.toString();
                sentence1 = sentence1.trim();
                String sentence2 = o2.toString();
                sentence2 = sentence2.trim();
                String[] wordsCentences1 = sentence1.split(" ");
                String[] wordsCentences2 = sentence2.split(" ");
                return wordsCentences1.length - wordsCentences2.length;
            }
        });

        System.out.println("\nОсортированные предложения по количеству слов в предожении.");
        for (StringBuilder string : strings) {
            System.out.println(string);
        }
    }
}
