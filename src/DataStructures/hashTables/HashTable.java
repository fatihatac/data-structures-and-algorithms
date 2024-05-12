package DataStructures.hashTables;

public class HashTable {
    private int size;
    private Node[] data;

    public HashTable(int size) {
        this.size = size;
        this.data = new Node[size];
    }

    public int hash(String key) {
        int hash = 0;

        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.data.length;
        }
        return hash % size;
    }

    public void set(String key, String value) {
        int address = hash(key);
        Node node = new Node(key, value);
        if (data[address] == null) {
            data[address] = node;
        } else {
            Node temp = data[address];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public String get(String key) {
        int address = hash(key);
        Node node = data[address];

        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    public void remove(String key) {
        int address = hash(key);
        Node prev = null;
        Node node = data[address];

        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) {
                    data[address] = node.next;
                } else {
                    prev.next = node.next;
                }
                break;
            }
            prev = node;
            node = node.next;
        }
    }

    private class Node {

        private String key;
        private String value;
        private Node next;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        hashTable.set("key1", "value1");
        hashTable.set("key2", "value2");
        hashTable.set("key3", "value3");

        System.out.println(hashTable.get("key1")); // "value1"
        System.out.println(hashTable.get("key2")); // "value2"
        System.out.println(hashTable.get("key3")); // "value3"

        hashTable.remove("key2");

        System.out.println(hashTable.get("key2")); // null
    }
}
