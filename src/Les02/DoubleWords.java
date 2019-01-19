/*
* Используя коллекцию удвойте слово:
1. Введите с клавиатуры 5 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведите результат на экран, каждое значение с новой строки.
* */

package Les02;

import java.util.*;

public class DoubleWords {

    public static List<String> doubleValues(List<String> strings) {
        int len = strings.size();
        for (int i = 0; i < len*2; i+=2) {
            strings.add(i+1, strings.get(i));
        }
        return strings;
    }

    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            strings.add(sc.next());
//            System.out.println(((LinkedList<String>)strings).getLast());
        }
        DoubleWords.doubleValues(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
