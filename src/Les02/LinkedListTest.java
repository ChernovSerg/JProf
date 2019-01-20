package Les02;
/* Минимальное из N чисел(использовать LinkedList):
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
* */

import java.util.*;

public class LinkedListTest<S> {
    List<Integer> list = new LinkedList<>();

    public void getIntegerList(int[] sourceList) {
        for (int i = 0; i < sourceList.length; i++) {
            list.add((Integer)sourceList[i]);
        }
    }

    public Integer getMinimum () {
        Integer[] ar = list.toArray(new Integer[list.size()]);
        Arrays.sort(ar);
        return ar[0];
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        LinkedListTest listTest = new LinkedListTest();
        System.out.print("Введите кол-во элементов массива: ");
        int n = reader.nextInt();
        System.out.println("Введите элементы массива. Элементы массива должны быть целыми числами.");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент [" + i + "] = ");
            arr[i] = reader.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        listTest.getIntegerList(arr);
        Integer min = listTest.getMinimum();
        System.out.println("Минимальный элемент массива = " + min);
    }
}
