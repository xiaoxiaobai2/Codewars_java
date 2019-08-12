package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test_list {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("aaa");
        List list1 = new ArrayList();
        list1.add("aaa");
        list1.add("bbb");
        list.add(list1);//把arraylist对象添加进去
        list.addAll(list1);//把list2里面的所有内容加进去
        list.remove("aaa");//删除一个之后后面的往前补
        System.out.println(list.size());
        System.out.println(list.get(0));
    }
}
