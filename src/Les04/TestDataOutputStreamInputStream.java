/*
 * 29.01.19 20:23 Created by Sergey Chernov.
 */

package Les04;

import java.io.*;
import java.util.Arrays;
import java.util.Random;


public class TestDataOutputStreamInputStream {
    public static void main(String[] args) throws IOException {

        Random random = new Random();
        File f = new File("file.txt");
        File fileSort = new File("file_sort.txt");

        try (DataOutputStream writer = new DataOutputStream(new FileOutputStream(f))) {
            for (int i = 0; i < 5; i++) {
                writer.writeInt(random.nextInt());
            }
        }

        try (DataInputStream fileReader = new DataInputStream(new FileInputStream(f));
             DataOutputStream writerSort = new DataOutputStream(new FileOutputStream(fileSort))) {
            int n = fileReader.available() / 4;
            int[] arrInt = new int[n];

            System.out.println("Считываем из файла:");
            for (int i = 0; i < n; i++) {
                arrInt[i] = fileReader.readInt();
                System.out.println((i + 1) + ") " + arrInt[i]);
            }
            System.out.println("Сортируем числа:");
            Arrays.sort(arrInt);
            System.out.println(Arrays.toString(arrInt));

            System.out.println("Записываем числа в файл " + fileSort.getName());
            for (int i = 0; i < n; i++) {
                writerSort.writeInt(arrInt[i]);
            }
        }
    }
}
