package Others_collection;


import java.util.*;

/**
  * @author:  Zhang
  * @description:
  *
  * 测试Collections.synchronizedXXXX    包装成线程安全的
 *
 **/
public class SynTest {
    public static void main(String[] args) {
        System.out.println("***************************************************");
        System.out.println("将Arraylist 包装成线程安全的list");
        List<String> list = new ArrayList<String>();
        List<String> synlist = Collections.synchronizedList(list);
        synlist.add("Hello");

        System.out.println("***************************************************");
        System.out.println("collection.unmodifiableMap 返回一个不能修改的map");
        Map<String,String> map = new HashMap<String, String>();
        map.put("Java","Hello");
        Map<String,String> map1 = Collections.unmodifiableMap(map);
//        map1.put("heee","as");//不能修改

        System.out.println("***************************************************");
        System.out.println("collection.unmodifiableMap 返回一个只有一对元素的map");
        Map<String,String> map3 = Collections.singletonMap("java","hello");
//        map3.put("heee","as");//不能修改



    }
}
