package DataStructures.stacksAndQueues;

public class StacksWithLinkedList {

    Node top;
    Node bottom;
    int length;

    public StacksWithLinkedList() {
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public Node peek() {
        return this.top;
    }

    public void push(Object value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.top = newNode;
            this.bottom = this.top;
        } else {
            Node holdingPointer = this.top;
            this.top = newNode;
            this.top.next = holdingPointer;
        }
        this.length++;
    }

    public Node pop() {
        if (this.top == null) {
            return null;
        }
        if (this.top == this.bottom) {
            this.bottom = null;
        }
        Node holdingPointer = this.top;
        this.top = this.top.next;
        this.length--;
        return holdingPointer;
    }

    @Override
    public String toString() {
        return "StacksWithLinkedList{" +
                "top=" + top.value +
                ", bottom=" + bottom.value +
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
        StacksWithLinkedList myStack = new StacksWithLinkedList();
        myStack.push("google");
        myStack.push("amazon");
        myStack.push("goodreads");
        myStack.push("diablo");

        System.out.println(myStack.peek().value);
        System.out.println(myStack.toString());
        myStack.pop();
        myStack.pop();
        myStack.pop();

        System.out.println(myStack.toString());
    }
}
