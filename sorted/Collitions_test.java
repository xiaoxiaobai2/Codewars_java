package sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collitions_test {
    public static void main(String[] args) {
        test01();
        System.out.println("***************************************************************");
        doudizhu();
    }

    public static void test01(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List原始数据顺序：");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("翻转：");
        System.out.println(list);
        Collections.shuffle(list);//洗牌，可以用来模拟打牌游戏
        System.out.println("打乱：");
        System.out.println(list);
        Collections.swap(list,1,3);
        System.out.println("交换2号位和四号位：");
        System.out.println(list);
    }

    public static void doudizhu(){
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> p1 = new ArrayList<Integer>();
        List<Integer> p2 = new ArrayList<Integer>();
        List<Integer> p3 = new ArrayList<Integer>();
        List<Integer> dipai = new ArrayList<Integer>();
        for (int i =1;i<55;i++)
            list.add(i);
        Collections.shuffle(list);
        for (int i=0;i<51;i+=3){
            p1.add(list.get(i));
            p2.add(list.get(i+1));
            p3.add(list.get(i+2));
        }
        dipai.add(list.get(51));
        dipai.add(list.get(52));
        dipai.add(list.get(53));
        System.out.println("玩家1：" + p1);
        System.out.println("玩家2：" + p2);
        System.out.println("玩家3：" + p3);
        System.out.println("底牌：" + dipai);
    }
}
