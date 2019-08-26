package sorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ItemAPP {
    public static void main(String[] args) {
        List<NewsItem> list = new ArrayList<NewsItem>();
        list.add(new NewsItem("震惊，力争居然和好会做那种事情！",new Date(),100));
        list.add(new NewsItem("震惊，种事情！",new Date(System.currentTimeMillis()-1000*60*60),1000));
        list.add(new NewsItem("震惊，然和好会做那种事情！",new Date(System.currentTimeMillis()-1000*60*60*5),10));
        System.out.println("排序前：");
        System.out.println(list);
        System.out.println("排序后：");
        Collections.sort(list);//利用实例类排序
        System.out.println(list);
    }
}
