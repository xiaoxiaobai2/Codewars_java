package collection;

import java.util.*;

public class Test_iter {
    public static void main(String[] args) {
        Set map = new HashSet();
        map.add("张浩");
        map.add(12);
        map.add(24);

        Iterator iterator=map.iterator();
        while (iterator.hasNext()){
            String string = iterator.next().toString();
            System.out.println(string);
        }
        for (Iterator iterator2=map.iterator();iterator2.hasNext();){
            String string = iterator2.next().toString();
            System.out.println(string);
        }
    }
}
