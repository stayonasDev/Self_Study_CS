package list.arraylist;

import list.MakeList;

import java.util.Collection;

public class MakeArrayList<E> implements MakeList<E> {
private int size;
private static final int DEFAULT_SIZE = 10;
private static Object[] array;
private static Object[] defaultArray = { };

    public MakeArrayList() {
        array = new Object[DEFAULT_SIZE];
    }
    public MakeArrayList(int size){
        if(size > 0){
            array = new Object[size];
        }else if(size == 0){
            array = new Object[DEFAULT_SIZE];
        }else{
            throw new IllegalArgumentException("No");
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void addAll(int index, Collection c) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains() {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
