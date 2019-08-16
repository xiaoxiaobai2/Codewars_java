package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test_Map {
    public static void main(String[] args) {
        String letters = "This is a cat and that is a mice and where is food";
        String[] letter = letters.split(" ");
        Map<String,Letter> map = new HashMap<String, Letter>();
        for(String temp:letter){
            Letter letter1=new Letter();
            if (!map.containsKey(temp)){
                letter1.setNumber(1);
                map.put(temp,letter1);
            }else {
                letter1 = map.get(temp);
                letter1.setNumber(letter1.getNumber()+1);
            }
        }
        Set<String> set = map.keySet();
        for (String s:set){
            System.out.println("word:" + s + "     counts:" + map.get(s).getNumber());
        }
        System.out.println("*****************************************");
        //用迭代器遍历
        for (Iterator<String> iterator = set.iterator();iterator.hasNext();){
            /**
             * 注意这样调用迭代器是错误的，iterator.next每调用一次，就会往后走一次
             */
//            System.out.println("word:" + iterator.next() + "     counts:" + map.get(iterator.next()).getNumber());
            String s=iterator.next();
            System.out.println("word:" + s + "     counts:" + map.get(s).getNumber());
        }
    }
}
class Letter{
    private String letter;
    private int number;

    public Letter() {
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
