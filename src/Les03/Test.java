/*
 * 26.01.19 23:22 Created by Sergey Chernov.
 */

package Les03;

import java.util.LinkedList;

class Entry {
    int key;
    String field;

    public Entry(int key, String field) {
        this.key = key;
        this.field = field;
    }

    private boolean add(int key, String field) {
        return true;
    }
}

class Bucket {
    LinkedList<Entry> entries = new LinkedList<Entry>();
    private int length = 0;

    public int getLength() {
        return length;
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
        length++;
    }

    private String getValue(int key) {
        for (Entry entry : entries) {
            if (entry.key == key) {
                return entry.field;
            }
        }
        return null;
    }
}


public class Test {
    public static void main(String[] args) {
        Bucket[] b = new Bucket[5];
        b[0] = new Bucket();
        Entry entry = new Entry(2, "qwe");
        b[0].addEntry(entry);
    }
}
