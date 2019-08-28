package Others_collection;

import java.util.LinkedList;
import java.util.Queue;

/**
  * @author:  Zhang
  * @description:
  * 测试单向队列
  *
 **/
public class Queue_test {
    public static void main(String[] args) {
        Queue<Integer>  queue = new LinkedList<Integer>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("开始队列大小：" +queue.size());
        System.out.println("遍历队列（先进先出原则）：");
        for (Integer i:queue){
            System.out.println(i);
        }
        System.out.println("遍历后队列大小：" + queue.size());
    }
}
