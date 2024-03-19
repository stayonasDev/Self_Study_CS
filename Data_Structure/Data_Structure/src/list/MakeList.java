package list;

import java.util.Collection;

public interface MakeList <E>{
    public abstract void add();
    public abstract void addAll(int index, Collection<? extends E> c);

    public abstract  E get(int index);
    public abstract E remove(int index);
    public abstract  void clear();
    public abstract boolean contains();
    public abstract int indexOf(Object o);
    public abstract boolean isEmpty();
    public abstract  int size();

}
