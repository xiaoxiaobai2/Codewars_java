package Others_collection;

import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Vector;
/**
  * @author:  Zhang
  * @description:
  *
  * 测试古老的类 Enumeration  类似于Iterator
 *  只有两个方法  hasMoreElements
 *                nextElement
 **/
public class Enumeration_test {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("www.baidu.coom");
        vector.add("beijing.sxt.cn");
        vector.add("www.4399.com");
        System.out.println("***********   测试Enumeration类   ***********");
        Enumeration<String> enumeration=vector.elements();
        System.out.println("遍历：");
        while (enumeration.hasMoreElements())
            System.out.println(enumeration.nextElement());

        System.out.println("*********   测试Enumeration实现的类StringTokenizer（划分字符串，返回Enumeration类型）   ********");
        String s = "张浩;力争;侯刚;李鹏";
        StringTokenizer sT = new StringTokenizer(s,";");
        while (sT.hasMoreElements())
            System.out.println(sT.nextElement());
    }


}
