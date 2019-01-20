package Les02;
/*
*  Вводить с клавиатуры строки, пока пользователь не введёт строку 'end':
1. Создать список строк.
2. Ввести строки с клавиатуры и добавить их в список.
3. Вводить с клавиатуры строки, пока пользователь не введёт строку "end". "end" не учитывать.
4. Вывести строки на экран, каждую с новой строки.
* */

import java.util.*;

public class AddTask {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        System.out.println("Вводите строки. Для выхода введите 'END'.");
        String tmp;
        do {
            tmp = reader.next().toUpperCase();
            if (!tmp.equals("END")) {
                stringList.add(tmp);
            }
        } while (!tmp.equals("END"));
        System.out.println(stringList.toString());
    }

}
