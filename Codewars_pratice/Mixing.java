package Codewars_pratice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mixing {

    public static String mix(String s1,String s2){
        String answer="";
        My my=new My();

        //将s1,s2转变为字符数组
        my.change_map(s1,s2);

        //每次查找出现次数最多且顺序小的字母，同时去除出现次数为1的字母
        while (my.s1_map.size()!=0||my.s2_map.size()!=0){

            Letter letter=new Letter();
            Letter letter2=new Letter();

            letter=my.find_mix(my.s1_map,1);
            letter2=my.find_mix(my.s2_map,2);

            //比较s1和s2的最大值
            if (letter.getTime()<letter2.getTime())
                letter=letter2;
            else if (letter.getTime()==letter2.getTime())
                if (letter2.getLetter()<letter.getLetter())
                    letter=letter2;
                else if(letter2.getLetter()==letter.getLetter()){
                    letter.setNum(0);
                    my.s1_map.remove(letter.getLetter());
                    my.s2_map.remove(letter.getLetter());
                    if (my.find_mix(my.s1_map,1).getTime()<letter.getTime()&&my.find_mix(my.s2_map,2).getTime()<letter.getTime()){

                        /*

                        此处未完


                         */
                    }

                }
            my.s1_map.remove(letter.getLetter());
            my.s2_map.remove(letter.getLetter());

            //读取出现组多次数的字母的letter,编写答案，去除字母
            if (letter.getNum()==0){
                answer += "=:";
                for (int i=0;i<letter.getTime();i++){
                    answer +=letter.getLetter();
                }
                answer += "/";
            }else {
                answer += letter.getNum() +  ":";
                for (int i=0;i<letter.getTime();i++){
                    answer +=letter.getLetter();
                }
                answer += "/";
            }
        }
        if (answer.length()>0)
            answer =answer.substring(0,answer.length()-1);
        return answer;
    }



    public static void main(String[] args) {
        String s1="my&friend&Paul has heavy hats! &";
        String s2="my friend John has many many friends &";
        System.out.println(mix(" ", " "));

    }
}

class My{
    Map<Character,Letter> s1_map = new HashMap<Character,Letter>();
    Map<Character,Letter> s2_map = new HashMap<Character,Letter>();

    public void change_map(String s1,String s2){
        char[] s1_char = s1.toCharArray();
        char[] s2_char = s2.toCharArray();
        //存储每一个字母出现的次数
        for (char c:s1_char){
            if (c>=97&&c<=122){
                if (!s1_map.containsKey(c)){
                    Letter letter=new Letter();
                    letter.setLetter(c);
                    letter.setTime(1);
                    s1_map.put(c,letter);
                }else {
                    Letter letter=s1_map.get(c);
                    letter.setTime(letter.getTime()+1);
                }
            }
        }

        for (char c:s2_char){
            if (c>=97&&c<=122){
                if (!s2_map.containsKey(c)){
                    Letter letter=new Letter();
                    letter.setLetter(c);
                    letter.setTime(1);
                    s2_map.put(c,letter);
                }else {
                    Letter letter=s2_map.get(c);
                    letter.setTime(letter.getTime()+1);
                }
            }
        }
    }

    //查找出现次数最多且顺序小的字母，同时去除出现次数为1的字母
    public Letter find_mix(Map<Character,Letter> map,int i){
        Set<Character> set = map.keySet();
        Letter letter=new Letter();//用来记录出现次数最多的字母
        for (Iterator<Character> iter = set.iterator();iter.hasNext();) {
            char c = iter.next();

            if (map.get(c).getTime() == 1) {
                iter.remove();
            } else {
                if (map.get(c).getTime() > letter.getTime()) {
                    letter = map.get(c);
                    letter.setNum(i);//记录字符串编号
                } else if (map.get(c).getTime() == letter.getTime()&&c < letter.getLetter()){
                    letter = map.get(c);
                    letter.setNum(i);//记录字符串编号
                }
            }
        }
        return letter;
    }
}
class Letter{
    private int time;//字母出现的次数
    private char letter;//字母名
    private int num;
    public Letter() {
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
}