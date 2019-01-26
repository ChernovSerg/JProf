/*
 * 26.01.19 16:58 Created by Sergey Chernov.
 *
 * Собственная Hashtable.
 * Реализовать метод вставки в собственном классе SimpleHashtable
 * Реализовать методы замещения, удаления в собственном классе SimpleHashtable дополняя предыдущее задание.
 *
 */

package Les03;

import java.util.*;

/* Хэштаблица, хранящая пары <Integer, String>
 *
 */
class MyHashTable {
    private final int size = 10;
    private final int lengthBucket = 5;

    private Bucket[] buckets;

    MyHashTable() {
        buckets = new Bucket[size];
        for (int i = 0; i < size; i++) {
            buckets[i] = new Bucket();
        }
    }

    boolean add(int i, String str) {
        Entry entry = new Entry(i, str);
        int indexBucket = hash(i);
        if (buckets[indexBucket] == null || buckets[indexBucket].getLength() < lengthBucket) {
            return buckets[indexBucket].addEntry(entry);
        }
        return false;
    }

    boolean delete(int key, String value) {
        Entry delEntry = new Entry(key, value);
        int indexBucket = hash(delEntry.key);
        return buckets[indexBucket].delete(delEntry);
    }

    boolean setValueByKey(int key, String newValue) {
        int indexBucket = hash(key);
        return buckets[indexBucket].setValue(key, newValue);
    }

    private int hash(int key) {
        return key % size;
    }

    //=====================================================
    private class Bucket {
        LinkedList<Entry> entries;// = new LinkedList<Entry>();
        private int length = 0;

        private Bucket() {
            this.entries = new LinkedList<>();
        }

        private int getLength() {
            return length;
        }

        private boolean addEntry(Entry entry) {
            if (!containsKey(entry.key)) {
                entries.add(entry);
                length++;
                return true;
            }
            return false;
        }

        private boolean containsKey(int key) {
            for (Entry entry : entries) {
                if (entry.key == key) {
                    return true;
                }
            }
            return false;
        }

        private String getValue(int key) {
            for (Entry entry : entries) {
                if (entry.key == key) {
                    return entry.field;
                }
            }
            return null;
        }

        private boolean setValue(int key, String newVal) {
            for (Entry entry : entries) {
                if (entry.key == key) {
                    entry.field = newVal;
                    return true;
                }
            }
            return false;
        }

        private boolean delete(Entry entry) {
            if (!entries.isEmpty()) {
                if (entries.remove(entry)) {
                    length--;
                    return true;
                }
            }
            return false;
        }

    }

    //=====================================================
    private static class Entry {
        private int key;
        private String field;

        private Entry(int key, String field) {
            this.key = key;
            this.field = field;
        }

        private boolean add(int key, String field) {
            return true;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Entry entry = (Entry) o;
            return key == entry.key &&
                    field.equals(entry.field);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, field);
        }
    }

}

public class SimpleHashTable {
    public static void main(String[] args) {
        MyHashTable myHashTable = new MyHashTable();
        System.out.println(myHashTable.add(5, "Serg"));
        System.out.println(myHashTable.add(8, "Alex"));
        System.out.println(myHashTable.add(4, "Roma"));

        System.out.println(myHashTable.delete(8,"Alex"));
        System.out.println(myHashTable.delete(44,"Alex"));
        System.out.println(myHashTable.setValueByKey(4, "TTT"));
        System.out.println(myHashTable.setValueByKey(42, "TTT"));

        System.out.println(myHashTable.add(5, "Dima"));
        System.out.println(myHashTable.add(3, "Serg"));
        System.out.println(myHashTable.add(6, "Serg"));
        System.out.println(myHashTable.add(15, "Serg"));
        System.out.println(myHashTable.add(25, "Serg"));
        System.out.println(myHashTable.add(35, "Serg"));
        System.out.println(myHashTable.add(50, "Serg"));
        System.out.println(myHashTable.add(44, "Serg"));
        System.out.println(myHashTable.add(33, "Serg"));
        System.out.println(myHashTable.add(33, "Serg"));
        System.out.println(myHashTable.add(33, "Serg"));
        System.out.println(myHashTable.add(33, "Serg"));
        System.out.println(myHashTable.add(33, "Serg"));
        System.out.println(myHashTable.add(33, "Serg"));
        System.out.println(myHashTable.add(33, "Serg"));
        System.out.println(myHashTable.add(33, "Serg"));
        System.out.println(myHashTable.add(33, "Serg"));
        System.out.println(myHashTable.add(5, "Dima"));
        System.out.println(myHashTable.add(22, "Serg"));
        System.out.println(myHashTable.add(11, "Serg"));
    }


}
