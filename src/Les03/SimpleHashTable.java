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
    private Bucket[] buckets;

    public MyHashTable() {
        buckets = new Bucket[10];
    }

    public void add(int i, String str) {
        Entry entry = new Entry(i, str);
        int indexBucket = hash(i, str);
//        buckets.get(indexBucket).add(entry);
    }

    private int hash(int n, String str) {
        return Objects.hash(n, str) % size;
    }

    private static class Bucket {
//        static Entry head;
//        static Entry last;
        LinkedList<Entry> entries = new LinkedList<>();

        private void add(Entry entry) {
            entries.add(entry);
//            if (head == null) {
//                head = entry;
//                last = entry;
//            } else {
//                last.next = entry;
//                last = entry;
//            }
        }

    }

    private static class Entry {
        private int key;
        private String field;
//        private Entry next;

        public Entry(int key, String field) {
            this.key = key;
            this.field = field;
//            this.next = null;
        }

        private boolean add(int key, String field) {

            return true;
        }


    }


}

public class SimpleHashTable {
//    public static void main(String[] args) {
//        MyHashTable myHashTable = new MyHashTable();
//        myHashTable.add(5, "Serg");
//    }


}
