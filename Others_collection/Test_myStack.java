package Others_collection;

/**
  * @author:  Zhang
  * @description:
  * 测试自己编写的栈
  *
 **/
public class Test_myStack {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<Integer>();
        System.out.println("*************     测试自己实现的栈     ***********");
        System.out.println("入栈顺序1234");
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println("栈的大小：" +myStack.size());
        System.out.println("***********************************************");
        System.out.println("读栈顶元素：" +myStack.top());
        System.out.println("栈的大小：" +myStack.size());
        System.out.println("***********************************************");
        System.out.println("出栈：" + myStack.pop());
        System.out.println("栈的大小：" +myStack.size());

        System.out.println("*********************************************0");
        System.out.println("遍历栈：");
        while (!myStack.isEmpty())
            System.out.println(myStack.pop());
        System.out.println("栈的大小：" +myStack.size());
    }
}
