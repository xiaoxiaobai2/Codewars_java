package Codewars_pratice;

import java.util.LinkedList;
import java.util.List;

public class DoubleLinear {
    public static int dblLinear (int n) {
        // your code
        int answer=0;
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        //计算前n/2个数，生成 u
        for (int i=0;i<=1+n/2;i++){
            int x=list.get(i)*2+1;
            int y=list.get(i)*3+1;

            //判断插入在末尾还是中间的标志
            boolean insert_last=true;
            //判断是否存在相同的值，存在则不插入
            boolean equal = false;

            int j;
            for (j=i+1;j<list.size();j++) {
                if (list.get(j)==x) {
                    equal = true;
                    break;
                }else if (list.get(j)>x){
                    insert_last = false;
                    break;
                }
            }
            if (!equal){
                if (insert_last)
                    list.add(x);
                else list.add(j,x);
            }
            //重置标志符
            insert_last=true;
            equal = false;
            for (j=i+1;j<list.size();j++) {
                if (list.get(j)==y) {
                    equal = true;
                    break;
                }else if (list.get(j)>y){
                    insert_last = false;
                    break;
                }
            }
            if (!equal){
                if (insert_last)
                    list.add(y);
                else list.add(j,y);
            }
            System.out.println(list);
        }
        return list.get(n);
    }

    public static void main(String[] args) {
        System.out.println(dblLinear(10000));
    }
}
