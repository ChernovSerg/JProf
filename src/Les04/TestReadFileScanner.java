/*
 * 02.02.19 23:13 Created by Sergey Chernov.
 *
 * Создайте в package текстовый файл и клас, внесите в файл некий текст.
 * Выведите на экран содержимое файла.
 */

package Les04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class TestReadFileScanner {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new FileReader(".\\src\\Les04\\test.txt"));
        sc.useLocale(Locale.US);

        while (sc.hasNextLine()) {
            if (sc.hasNextInt() || sc.hasNextBigInteger() || sc.hasNextLong() || sc.hasNextByte() || sc.hasNextShort()) {
                System.out.println("\"" + sc.next() + "\"" + " - целое число");
            }
            else if (sc.hasNextDouble() || sc.hasNextBigDecimal() || sc.hasNextFloat()) {
                System.out.println("\"" + sc.next() + "\"" + " - дробное число");
            }
            else {
                System.out.println("\"" + sc.next() + "\"" + " - слово");
            }
        }

    }
}
