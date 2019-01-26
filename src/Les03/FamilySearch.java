/*
 * 26.01.19 Created by Sergey Chernov.
 *
 * Задание
 * Программа определяет, какая семья (фамилия) живёт в городе:
 * Пример ввода:
 *   Москва - Ивановы
 *   Киев - Петровы
 *   Лондон - Абрамовичи
 *
 * Ввести город:
 *   Лондон
 *
 * Пример вывода:
 * - Абрамовичи
 */

package Les03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FamilySearch {
    public static void main(String[] args) {
        Map<String, String> families = new HashMap<>();
        Scanner reader = new Scanner(System.in);

        try {
            System.out.println("Введите 3 пары значений через дефис: Город - Фамилия семьи");
            String[] pair;
            for (int i = 0; i < 3; i++) {
                String str = reader.nextLine();
                pair = str.split("-");
                families.put(pair[0].trim(), pair[1].trim());
            }

            System.out.println("Введите название Города, чтобы найти Фамилию семьи");
            String town = reader.next();

            String result = (String) families.get(town);
            if (result == null || result.isEmpty()) {
                System.out.println("Неверно введен Город");
            } else {
                System.out.println("Найдена семья: " + result);
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        finally {
            reader.close();
        }
    }

}
