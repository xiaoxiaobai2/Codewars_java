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
<<<<<<< HEAD
        //在外部实现Comparator 的 compare方法
=======
        //已经实现了 Comparator 的compare方法
>>>>>>> 2bac5510a2e5d64bc99a3a3dab22acfab18d9ad7
        Collections.sort(goods,new ComparePrice());
        System.out.println(goods);
    }
}
