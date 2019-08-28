package Learn_guava;

import com.google.common.collect.Sets;

import java.util.Set;

/**
  * @author:  Zhang
  * @description:
  *
  * 测试交集、差集、并集
 **/
public class Demo02 {
    public static void main(String[] args) {

        Set<Integer> set1 = Sets.newHashSet(1,2,3,4);
        Set<Integer> set2 = Sets.newHashSet(2,4,6,8);
        System.out.println("集合1：" + set1.toString());
        System.out.println("集合2：" + set2.toString());
        //求交集
        Sets.SetView<Integer> setView= Sets.intersection(set1,set2);
        System.out.println("求交集：");
        System.out.println(setView.toString());
        //求并集
        Sets.SetView<Integer> setView1 = Sets.union(set1,set2);
        System.out.println("求并集：");
        System.out.println(setView1.toString());
        //求差集
        Sets.SetView<Integer> setView2 = Sets.difference(set2,set1);
        System.out.println("求差集（A-B  A中属于B 的去掉）：");
        System.out.println(setView2.toString());
    }
}
