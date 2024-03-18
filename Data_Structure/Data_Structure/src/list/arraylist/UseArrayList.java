package list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {
        //ArrayList 가변 크기지만 기본 5 - 10
        List<Integer> arrayList  = new ArrayList<>();
        //정적배열 ArrayList 동적 배열 변경
        Integer[] array = {1, 2, 3};
        List<Integer> arrayList2 = new ArrayList<>(Arrays.asList(array));


        //ArrayList 요소 추가
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        //요소삭제
        arrayList.remove(3);

        if(arrayList.containsAll(arrayList2)){
            System.out.println("arrayList == arrayList2");
        }else{
            System.out.println("arrayList != arrayList2");
        }
    }
}
