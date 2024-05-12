package DataStructures.stacksAndQueues;

import java.util.ArrayList;

public class StacksWithArrayList {
    ArrayList<Object> arrayList;

    public StacksWithArrayList() {
        this.arrayList = new ArrayList<>();
    }

    public Object peek() {
        return this.arrayList.get(arrayList.size() - 1);
    }

    public void push(Object value) {
        this.arrayList.add(value);
    }

    public void pop() {
        this.arrayList.remove(arrayList.size() - 1);
    }

    @Override
    public String toString() {
        return "StacksWithArrayList{" +
                "arrayList=" + arrayList +
                '}';
    }


    public static void main(String[] args) {
        StacksWithArrayList myStack = new StacksWithArrayList();
        myStack.push("google");
        myStack.push("ztm");
        myStack.push("discord");
        System.out.println(myStack.peek());
        System.out.println(myStack.toString());
        myStack.pop();
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.toString());

    }
}
