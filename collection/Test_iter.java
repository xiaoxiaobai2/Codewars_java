package collection;

import java.util.*;

public class Test_iter {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("张浩");
        set.add(12);
        set.add(24);

        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            String string = iterator.next().toString();
            System.out.println(string);
        }

        for (Iterator iterator2=set.iterator();iterator2.hasNext();){
            String string = iterator2.next().toString();
            System.out.println(string);
        }
    }
}
