package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class My_iterator {
    private String[] strings= {"a","b","c","d"};
    private int cursor = 0;
    private int size = strings.length;

    //匿名内部类
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            public boolean hasNext(){
                return cursor<size;
            }

            public String next(){
                return strings[cursor++];
            }

            public void remove(){

            }
        };
    }

    public static void main(String[] args) {
        My_iterator my_iterator=new My_iterator();
        Iterator<String> iterator=my_iterator.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        iterator=my_iterator.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

