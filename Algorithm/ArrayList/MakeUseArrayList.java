package Study.ArrayList;

import java.util.Arrays;

public class MakeUseArrayList {
    public static void main(String[] args) {
        MakeArrayList<Integer> arrayList = new MakeArrayList<>();

        for(int i=1; i<6; i++){
            arrayList.add(i);
            System.out.print(arrayList.get(i-1) + " ");
        }

        System.out.println();
        System.out.println("arrayList.get(1): " + arrayList.get(1 ));
        System.out.println("arrayList.contains(4): " + arrayList.contains(4));
        System.out.println("arrayList.remove(1): " + arrayList.remove(1));
        System.out.println("arrayList.contains(1): " + arrayList.contains(1));
        System.out.println("arrayList.add(0, 10): " + arrayList.add(0, 10));
        System.out.println();

        System.out.println(arrayList.size());
        for(int i=0; i<arrayList.size(); i++){
            System.out.print("arrayList[" + i + "] = " + arrayList.get(i));
            System.out.println();
        }
    }
}

class MakeArrayList<T>{
    private T[] list;
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int size;

    public MakeArrayList(){
        list = (T[]) new Object [DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
        size = 0;
    }
    public MakeArrayList(int capacity){
        list  =(T[]) new Object[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public boolean add(T element){
        sizeManager();
        list[size] = element;
        size++;
        return true;
    }

    public boolean add(int index, T element){
        sizeManager();
        for(int i=size; i>index; i--){
            list[i] = list[i-1];
        }
        list[index] = element;
        size++;
        return true;
    }

    public void sizeManager(){
        if(size > capacity){
            capacity =  capacity * 2;
            Arrays.copyOf(list, capacity);
        }
    }

    public T get(int index){
            if(index > size && size < 0){
            throw new IndexOutOfBoundsException();
        }
            else if(list[index] == null) {
            throw new NullPointerException();
        }
        return list[index];
    }

    public boolean contains(T element){
        for(int i=0; i<size;i++){
            if(list[i] == element){
                return true;
            }
        }
        return false;
    }

    public T remove(int index){
        if(index < 0 && index > size){
            throw new IndexOutOfBoundsException();
        }
        T element = list[index];
        for(int i=index; i<size;i++){
            list[i] = list[i+1];
        }
        size--;
        return element;
    }

    public int size(){
        return size;
    }
}
