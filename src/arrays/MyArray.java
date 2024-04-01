package arrays;

import java.util.Arrays;

public class MyArray {
    private int length;
    private Object[] data;
    private int capacity;
    public MyArray(){
        this.length = 0;
        this.data = new Object[1];
        this.capacity = 1;
    }
    public Object get(int index){
        return this.data[index];
    }
    public void push(Object item){
        if(capacity == length) {
            data = Arrays.copyOf(data, capacity * 2);
            capacity *= 2;
        }
        data[length] = item;
        length++;
    }

    public Object pop(){
        Object lastItem = this.data[this.length -1];
        this.data[this.length-1] = null;
        this.length--;

        return lastItem;
    }

    public Object delete(int index){
        Object itemToDelete = this.data[index];
        shiftItems(index);
        return itemToDelete;
    }

    public void shiftItems(int index){
        for (int i = index; i < this.length-1; i++) {
            this.data[i] = this.data[i+1];
        }
        this.data[this.length-1] = null;
        this.length--;
    }

    public int getLength() {
        return this.length;
    }

    public static void main(String[] args) {

        MyArray array = new MyArray();

        array.push("hi");
        array.push("how");
        array.push("are");
        array.push("you");

//        System.out.println(array.get(0));
//        System.out.println(array.get(1));
//
//        array.pop();

        System.out.println(array.get(2));

        array.delete(2);

        for (int i = 0; i < array.getLength(); i++) {
            System.out.println(array.get(i));
        }

    }
}


