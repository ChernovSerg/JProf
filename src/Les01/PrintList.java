/*Вывод на экран элементов List:
Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator.*/
package Les01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PrintList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i*2);
        }

        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


}
