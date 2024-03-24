package Study.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Integer[] array = {1, 2, 3, 4, 5};

        for(int e : array){
            arrayList.add(e);
        }

        System.out.println("ArrayList Size() = " + arrayList.size());
        System.out.println("ArrayList Get(4) = " + arrayList.get(4));
        System.out.println("ArrayList Contains(4) = " + arrayList.contains(4));
        System.out.println("ArrayList Equals(array) = " + arrayList.equals(Arrays.asList(array)));
        System.out.println("ArrayList Clear\n");
        arrayList.clear();

//        System.out.println("ArrayList Get(4) = " + arrayList.get(2));
        arrayList = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        System.out.println("ArrayList Equals(array) = " + arrayList.equals(Arrays.asList(array)));
        System.out.println("ArrayList Get(4) = " + arrayList.get(4));
        System.out.println("ArrayList Remove(4) = " + arrayList.remove(4));
//        System.out.println("ArrayList Get(4) = " + arrayList.get(4));

    }
}
