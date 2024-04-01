package linkedList;

import java.util.ArrayList;

public class MyLinkedList {
    Node head;
    Node tail;
    int length;

    public MyLinkedList(Object value) {
        this.head = new Node(value);
        this.tail = this.head;
        this.length = 1;
    }

    public void append(Object value) {
        Node newNode = new Node(value);
        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
    }

    public void prepend(Object value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
    }

    public void insert(int index, Object value) {
        if (index > this.length) {
            this.append(value);
        }

        Node newNode = new Node(value);
        Node leader = this.traverseToIndex(index - 1);
        Node follower = leader.next;
        leader.next = newNode;
        newNode.next = follower;
        this.length++;
    }

    public void remove(int index) {
        Node leader = this.traverseToIndex(index - 1);
        Node unwantedNode = leader.next;
        Node holdingPointer = unwantedNode.next;
        leader.next = unwantedNode.next;
        this.length--;
        this.printList();
    }

    public Node traverseToIndex(int index) {
        int counter = 0;
        Node currentNode = this.head;
        while (counter != index) {
            currentNode = currentNode.next;
            counter++;
        }
        return currentNode;
    }

    public ArrayList<Object> printList() {
        ArrayList<Object> list = new ArrayList<>();
        Node currentNode = this.head;
        while (currentNode != null) {
            list.add(currentNode.value);
            currentNode = currentNode.next;
        }
        return list;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }

    class Node {
        Object value;
        Node next;

        public Node(Object value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.append(5);
        myLinkedList.prepend(1);
        myLinkedList.insert(2, 99);
        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.printList());
        myLinkedList.remove(2);
        System.out.println(myLinkedList.printList());
    }
}
