package DataStructures.stacksAndQueues;

public class MyQueue {
    Node first;
    Node last;
    int length;

    public MyQueue() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public Node peek() {
        return this.first;
    }

    public void enqueue(Object value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length++;
    }

    public Node dequeue() {
        if (this.first == null) {
            return null;
        }
        if (this.first == this.last) {
            this.last = null;
        }
        Node holdingPointer = this.first;
        this.first = this.first.next;
        this.length--;
        return holdingPointer;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }


    @Override
    public String toString() {
        if (isEmpty()) {
            return null;
        }
        return "MyQueue{" +
                "first=" + first.value +
                ", last=" + last.value +
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
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        System.out.println(myQueue.peek());
        myQueue.enqueue("Joy");
        System.out.println(myQueue.peek().value);
        myQueue.enqueue("Matt");
        myQueue.enqueue("Pavel");
        myQueue.enqueue("Samir");

        System.out.println(myQueue.toString());

        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();
        System.out.println(myQueue.toString());


        System.out.println(myQueue.isEmpty());

    }
}
