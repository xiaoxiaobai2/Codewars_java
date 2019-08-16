package collection.my_map;

public class Test_mymap {
    public static void main(String[] args) {
        My_map map = new My_map();
        System.out.println("map是否为空：" + map.isEmpty());
        map.put("张浩","胡");
        map.containsKey("张浩");
        map.put(1,2);
        map.put(3,4);
        System.out.println(map.getSize());
        map.bianli();
        map.remove(3);
        System.out.println(map.getSize());
        map.bianli();
        System.out.println("map是否为空：" + map.isEmpty());
        My_map map1 = new My_map();
        map1.put("猪腩","王捷");
        map1.putALL(map);
        map1.bianli();
        System.out.println("新的map大小："  + map1.getSize());
        map1.clear();
        map1.putALL(map);
        map1.bianli();
        System.out.println("新的map大小："  + map1.getSize());
        System.out.println(map.hashCode());
    }
}
