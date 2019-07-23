package Exception_class;

import java.io.IOException;

public class Throw_exception {
    public static void main(String[] args) {
        A a = new A();
//        谁调用谁处理异常
        try {
            a.methods();//
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 子类异常不能超过父类
 *
 *
 */


class A {
    public void methods() throws IOException{}
}

class B extends A{
    public void methods() throws RuntimeException{}
}