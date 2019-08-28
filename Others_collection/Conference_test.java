package Others_collection;

import java.util.EnumMap;
import java.util.WeakHashMap;

/**
  * @author:  Zhang
  * @description:
  * 引用类型测试  ：  强引用   gc后不回收
 *                    软引用   内存不够时回收
 *                    弱引用   gc后回收       weakHashMap  键为弱引用
 *                    虚引用   必须和Reference queue一起用
 *
  *
 **/
public class Conference_test {
    public static void main(String[] args) {
        System.out.println("**********   引用类型测试（强、软、弱、虚）   *************");
        WeakHashMap<String,String> weakHashMap = new WeakHashMap<String, String>();
        String s = "a";
        weakHashMap.put("zhang","hao");
        weakHashMap.put(s,"a");
        weakHashMap.put(new String("b"),"b");//等会被回收
        System.gc();
        System.runFinalization();
        System.out.println(weakHashMap.size());

        System.out.println("*****************************************************");
        System.out.println("EnumMap,Key必须是枚举类型（enum）");
        EnumMap<Season,String> enumMap=new EnumMap<Season, String>(Season.class);
        enumMap.put(Season.SPRING,"春困");
        System.out.println(enumMap.get(Season.SPRING));

    }

}
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER;
}