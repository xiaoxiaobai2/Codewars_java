package collection.my_map;

import java.util.Arrays;

public class My_map {
    private int size;
    private final int length = 10;
    private Key_value[] k_y = new Key_value[length];

    public My_map(){
    }

    //向map里添加键值对
    public void put(Object key,Object value){
        Key_value  key_value = new Key_value();
        if (!containsKey(key)){
            key_value.setKey(key);
            key_value.setValue(value);
            k_y[size]=key_value;
            size++;
            if (size+1>k_y.length) kuorong();
        }else System.out.println("键已存在！");
    }

    //扩容
    private void kuorong(){
        Key_value[] k_y1 = Arrays.copyOf(k_y,k_y.length*2);
        k_y =k_y1;
    }

    //通过键找值
    public Object get(Object key){
        for(int i = 0;i<size;i++){
            if (k_y[i].getKey().equals(key))
                return k_y[i].getValue();
        }
        return "不存在！";
    }

    //通过键移除
    public void remove(Object key){
        int i;
        for (i=0;i<size;i++){
            if (k_y[i].getKey().equals(key)){
                //覆盖
                for (int j=i;j<size;j++)
                    k_y[j] = k_y[j+1];
                size--;
                break;
            }
        }
        if(i>=size+1) System.out.println("要删除的键不存在！");
    }

    //含有某个键
    public boolean containsKey(Object key){
        for(int i = 0;i<size;i++){
            if (k_y[i].getKey().equals(key))
                return true;
        }
        return false;
    }

    //含有某个值
    public boolean containsValue(Object value){
        for(int i = 0;i<size;i++){
            if (k_y[i].getValue().equals(value))
                return true;
        }
        return false;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        if (size!=0) return false;
        else return true;
    }

    public void clear(){
        k_y=null;
        size=0;
    }

    public void putALL(My_map my_map){
        if (size==0){
            k_y=my_map.k_y;
            size =my_map.size;
        }
        else {
            Key_value[] new_ky = Arrays.copyOf(k_y,k_y.length+my_map.size);
            for (int i=size;i<size+my_map.size;i++)
                new_ky[i] = my_map.k_y[i-size];
            k_y=new_ky;
            size +=my_map.size;
        }
    }

    public void bianli() {
        for (int i = 0; i < size; i++)
            System.out.println(k_y[i].getKey() + "," +k_y[i].getValue());
    }
}

