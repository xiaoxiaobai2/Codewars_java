package sorted;

import java.util.Comparator;
import java.util.TreeSet;

public class Person_test {
    public static void main(String[] args) {
        Person p1=new Person("周润发",1000);
        Person p2=new Person("刘德华",2000);
        Person p3=new Person("冯巩",10);
        System.out.println("使用匿名内部类进行排序");
        //匿名内部类
        TreeSet<Person> treeSet=new TreeSet<Person>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //按帅气程度升序
                return o1.getBeautiful()-o2.getBeautiful();}
        });
        //再添加时开始排序，所以不建议更改数值，可以在设定时加上final
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        System.out.println(treeSet);

        //利用外部类
        TreeSet<Person> treeSet2=new TreeSet<Person>(new CompareBea());
        //再添加时开始排序，所以不建议更改数值，可以在设定时加上final
        treeSet2.add(p1);
        treeSet2.add(p2);
        treeSet2.add(p3);
        System.out.println(treeSet);

        //创建javabean时 已经实现了Comparable 的compareTo方法
        System.out.println("使用实例类排序");
        TreeSet<Person> treeSet1 = new TreeSet<Person>();
        treeSet1.add(p1);
        treeSet1.add(p2);
        treeSet1.add(p3);
        System.out.println(treeSet1);
    }
}
