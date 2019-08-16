package generics;

import java.lang.reflect.Type;

public class Test {
    public static void main(String[] args) {
        Javabean<String,Integer> bean = new Javabean<>();//在此处确定将要存储的参数类型
        bean.setName("zhangh");
        System.out.println(bean.getName());
    }
}
