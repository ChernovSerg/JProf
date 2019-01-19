package Les01.AddTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 17, 4000);
        Animal bird = new Animal("King Penguin2", 15, 8, 50000);
        Animal animal1 = new Animal("King Penguin", 11, 8, 50000);
        Animal animal2 = new Animal("King Penguin", 15, 8, 50000);

        Animal[] c = {cat, dog, bird, animal1, animal2};

        Arrays.sort(c);   // ClassCastException w/o Comparable

        for (Animal tmp : c) {
            System.out.println(tmp);
        }
    }
}
