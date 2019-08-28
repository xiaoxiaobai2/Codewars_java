package Others_collection;

import java.util.ArrayDeque;
import java.util.Deque;

/**
  * @author:  Zhang
  * @description:
  * 领双线队列实现自己的栈（先进后出）
 *  包括   入栈
 *          出栈
 *          读栈顶元素
 *          栈的大小
 *          栈是否为空
  *
 **/
public class MyStack<T> {
    private Deque<T> deque = new ArrayDeque<T>();
    //入栈
    public void push(T t){
        deque.offerLast(t);
    }
    //出栈
    public T pop(){
        return deque.pollLast();
    }
    //读栈顶元素
    public T top(){
        return deque.getLast();
    }
    //栈的大小
    public int size(){
        return deque.size();
    }
    //栈是否为空
    public boolean isEmpty(){
        return deque.size()>0?false:true;
    }
}
