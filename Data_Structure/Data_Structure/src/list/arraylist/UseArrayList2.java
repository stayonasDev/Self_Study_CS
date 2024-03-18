package list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseArrayList2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(5);
        List<String> names2 = new ArrayList<>(Arrays.asList("Kim", "Lee", "Dong"));

        names.add("Kim");
        names.add("Nam");
        names.add("Jung");
        names.add("Dong");
        names.add("Lee");

        //for 출력 가능
        for(int i=0; i<names.size(); i++){
            System.out.print(names.get(i) + " / ");
        }
        System.out.println();

        // toString 출력 가능
        System.out.println("names2 : " + names2);

        //forEach 출력 가능
        for(String str : names2){
            if(names.contains(str)){
                System.out.println("names is Equal to : " + str);
            }
        }
    }
}
