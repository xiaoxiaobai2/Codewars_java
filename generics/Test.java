package generics;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Javabean<String,Integer> bean = new Javabean<>();//在此处确定将要存储的参数类型
        bean.setName("zhangh");
        Map map=new HashMap();
        map.put(1,2);
        System.out.println(map.get(2));
        System.out.println(bean.getName());
    }
}
