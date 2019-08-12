package collection;

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

    /**
      * @author:  Zhang
      * @description:
      * 获取列表长度
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
            }
            n = n.getNext();
        }
    }

    public void bianli(){
        Node n = first;
        while (n!=null){
            System.out.println(n.getObj());
            n = n.getNext();
        }
    }

    public boolean contains(Object obj){
        Node n = first;
        while (n!=null){
            if(obj.equals(n.getObj()))
                return true;
            n = n.getNext();
        }
        return false;
    }

    public Object get(int index){
        Node n=first;
        if(index>size){
            System.out.println("ERROR");
        }else {
            for(int i=1;i<index;i++){
                n = n.getNext();
            }
        }
        return n.getObj();
    }

    public static void main(String[] args) {
        Self_linklist self_linklist = new Self_linklist();
        self_linklist.add("aaa");
        self_linklist.add("bbb");
        self_linklist.add("ccc");
        self_linklist.remove("aaa");
        int size = self_linklist.getSize();
        System.out.println(size);
        self_linklist.bianli();
        System.out.println(self_linklist.get(2));
        System.out.println(self_linklist.contains("aaa"));
    }
}
