package collection.My_linklist;

public class Self_linklist {
    private Node first;
    private Node last;
    private int size;//链表长度
    /**
      * @author:  Zhang
      * @description:
      * 添加新节点
     **/
    public void add(Object obj){
        if (first == null){
            Node n = new Node();
            first = n;
            n.setObj(obj);
            last =n;
            size ++;
//            n.setPrevious(null);
//            n.setNext(null);
        }else {
            //创建新节点，设值，前驱，后继，更新最后一个节点
            Node n = new Node();
            n.setObj(obj);
            last.setNext(n);
            n.setPrevious(last);
            last = n;
            size++;
        }
    }


    //按索引添加元素
    public void add(int index, Object obj){
        range_out(index);
        if (index == 0){
            Node node = new Node();
            node.setObj(obj);
            node.setNext(first);
            first.setPrevious(node);
            first = node;
            size ++;
        }else {
            Node temp = first;
            for (int i =1;i<index;i++)
            {
                temp = temp.getNext();
            }
            Node node = new Node();
            node.setObj(obj);
            node.setNext(temp.getNext());
            temp.getNext().setPrevious(node);
            temp.setNext(node);
            size ++;
        }
    }


    //判断索引是否越界
    public void range_out(int index){
        if (index<0 || index >size-1) {
            try {
                throw new Exception();
            }catch (Exception e){
                System.out.println("越界！");
            }
        }
    }

    /**
      * @author:  Zhang
      * @description:
      * 获取链表长度
      *
     **/
    public int getSize(){
//        int size = 0;
//        Node n = first;
//        while (n!=null){
//            size ++;
//            n = n.getNext();
//        }
        return size;
    }


    //删除某个值
    public void remove(Object obj){
        Node n = first;
        while (n!=null){
            if(obj.equals(n.getObj())){
                size --;
                if (n == last){
                    last =n.getPrevious();
                    last.setNext(null);
                }
                else if(n == first){
                    first = n.getNext();
                    first.setPrevious(null);
                }
                else {
                    //n的前驱指向n的后继，n的后继指向n前驱
                    Node tem = n;
                    n.getPrevious().setNext(n.getNext());
                    n.getNext().setPrevious(n.getPrevious());
                }
                break;
            }
            n = n.getNext();
        }
        if (n == null)
            try {
                throw new Exception();
            }catch (Exception e){
                System.out.println("不存在！");
            }
    }


    //遍历链表
    public void bianli(){
        Node n = first;
        while (n!=null){
            System.out.println(n.getObj());
            n = n.getNext();
        }
    }

    //查询某个元素是否在链表内
    public boolean contains(Object obj){
        Node n = first;
        while (n!=null){
            if(obj.equals(n.getObj()))
                return true;
            n = n.getNext();
        }
        return false;
    }


    // 按索引查找元素，从0开始
    public Object get(int index){
        range_out(index);
        Node n = first;
        for(int i=1;i<=index;i++){
            n = n.getNext();
        }
        return n.getObj();
    }

    public static void main(String[] args) {
        Self_linklist self_linklist = new Self_linklist();
        self_linklist.add("aaa");
        self_linklist.add("bbb");
        self_linklist.add("ccc");
        self_linklist.remove("aaa");
        self_linklist.add(1,"ddd");//此处索引从0开始
        int size = self_linklist.getSize();
        System.out.println(size);
        self_linklist.bianli();
        System.out.println(self_linklist.get(2));//索引从0开始
        System.out.println(self_linklist.contains("aaa"));
    }
}
