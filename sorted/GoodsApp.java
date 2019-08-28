package sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsApp {
    public static void main(String[] args) {
        List<Goods> goods=new ArrayList<Goods>();
        goods.add(new Goods("雪糕",10,2));
        goods.add(new Goods("饮料",50,3));
        goods.add(new Goods("啤酒",1000,5));
        System.out.println("排序前：");
        System.out.println(goods);
        System.out.println("排序后：");
        //在外部实现Comparator 的 compare方法
        Collections.sort(goods,new ComparePrice());
        System.out.println(goods);
    }
}
