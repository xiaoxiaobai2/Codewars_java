package Learn_guava;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;


/**
  * @author:  Zhang
  * @description:
  * 
  * 测试  guava中  Function     Collection2.transform  应用函数
 *                              Collection2.filter    “过滤”
 *                              Functions.compose  组合函数
 * 
 **/
public class Test_guava {
    public static void main(String[] args) {
        List<String> list = Lists.newArrayList("bjsxt","hello");
        
        //编写函数，字符串小写变大写
        //编写函数，字符串小写变大写
        Function<String,String> f1=new Function<String, String>() {
            @Override
            public String apply(String input) {
                return input.toUpperCase();
            }
        };
        //编写函数，控制字符串的长度不超过5
        Function<String,String> f2=new Function<String, String>() {
            @Override
            public String apply(String input) {
                return input.length()>5?input.substring(0,5):input;
            }
        };
        
        //组合函数
        Function<String,String> f= Functions.compose(f1,f2);
        
        
        Collection<String> strings = Collections2.transform(list,f);
        for (String s:strings){
            System.out.println(s);
        }
        test01();
        test02();
    }

    //匿名内部类，编写转换函数
    public static void test01(){
        System.out.println("测试  Collections2.transform   new Function");
        List<String> list = Lists.newArrayList("hello","hi","good morning");
        //函数只使用一次，用匿名内部类
        Collection<String> strings=Collections2.transform(list, new Function<String, String>() {
            @Override
            public String apply(String input) {
                return input.substring(0,1).toUpperCase()+input.substring(1);
            }
        });
        for (String s:strings)
            System.out.println(s);
    }

    //测试  Collections2.filter   new Predicate
    public static void test02(){
        System.out.println("测试  Collections2.filter   new Predicate");
        List<String> list =Lists.newArrayList("123456","123","1234657");
        Collection<String> strings=Collections2.filter(list, new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                return input.length()<=5;
            }
        });
        for (String s:strings)
            System.out.println(s);
    }
}
