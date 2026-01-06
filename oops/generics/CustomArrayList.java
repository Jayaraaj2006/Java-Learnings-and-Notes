package Assignments.oops.generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data ;  // (private) because it cannot be accesssed by user.
    private static int DafaultSize = 10;
    private int size = 0;// also used as index value.

    public CustomArrayList() {
        this.data = new int[DafaultSize]; // size of data = 10.
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2]; // doubling the capacity or size of array.

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i]; // saving values of data array to temp array.
        }
        data = temp; // values of temp array is assigned to data array.
    }

    private boolean isFull() {
        return size == data.length;
    }

    //some methods in ArrayList.

    public int remove() // this method just deletes the last size of the array.
    {
        int removed = data[size--];
        return removed;
    }

    public int get(int index)  // this method returns the value of the index that user gives.
    {
        return data[index];
    }

    public int size()  // returns the size of the array.
    {
        return size;
    }

    public void set(int index,int value) // can set the values in the array by specifing the index value.
    {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomArrayList list = new CustomArrayList();

        for (int i = 0; i < 12; i++) {
            list.add(i);
        }


        System.out.println(list);

    }
}
