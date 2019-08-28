package Others_collection;

import java.util.ArrayDeque;
import java.util.Deque;

/**
  * @author:  Zhang
  * @description:
  * 测试双向队列
  *
 **/
public class Deque_test {
    public static void main(String[] args) {
        //双向队列
        Deque<Integer> deque = new ArrayDeque<>();
        System.out.println("***********     测试双线队列     *************");
        System.out.println("存入顺序为1234");
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerLast(4);
        System.out.println("初始队列大小：" + deque.size());
        System.out.println("*********************************************");
        System.out.println("获取队头(不删除)："+deque.getFirst());
        System.out.println("获取队尾（不删除）：" +deque.getLast());
        System.out.println("此时队列大小：" + deque.size());

        System.out.println("*********************************************0");
        System.out.println("获取队头(删除)："+deque.pollFirst());
        System.out.println("获取队尾（删除）：" +deque.pollLast());
        System.out.println("此时队列大小：" + deque.size());
    }
}
