package Codewars_pratice;

import java.util.ArrayList;
import java.util.List;

public class GetPins {
    public static List<String> getPINS(String observed){
        char[] chars=observed.toCharArray();
        List<Integer> Pin = new ArrayList<>();//将字符串转为数字存储在list中
        int[][] keyboard= new int[][]{{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};
        List<String> answer = new ArrayList<>();//用来存储答案
        //将字符转为数字存储在list中
        for (int i=0;i<observed.length();i++){
            Pin.add(chars[i]-48);
        }
        if (observed!=null&&observed.length()!=0){
            answer=get_others(0,Pin,keyboard);
            for (int i=1;i<observed.length();i++) {
                //保存此次可能的键
                List<String> list = new ArrayList<>();
                //转存
                List<String> temp = new ArrayList<>();

                list=get_others(i,Pin,keyboard);

                //转存answer，清空answer，组合此次结果和前面的answer，重置新的answer
                temp.addAll(answer);
                answer.clear();
                for (int k=0;k<temp.size();k++){
                    for (int j=0;j<list.size();j++){
                        String s=temp.get(k)+list.get(j);
                        answer.add(s);
                    }
                }
            }
        }
        //找所有可能的PIN
        return answer;
    }
    //找出该键所有相邻的键
    public static List<String> get_others(int i,List<Integer> Pin,int[][] keyboard){
        int x,y;
        List<String> answerlist = new ArrayList<>();
        if (Pin.get(i)==0){ x=3;y=1;
        }else { x=(Pin.get(i)-1)/3;y=(Pin.get(i)-1)%3; }

        answerlist.add(Pin.get(i)+"");
        //上边存在按键
        if (x-1>=0&&keyboard[x-1][y]!=-1){
            answerlist.add(keyboard[x-1][y]+"");
        }
        //下边存在键
        if (x+1<=3&&keyboard[x+1][y]!=-1){
            answerlist.add(keyboard[x+1][y]+"");
        }
        //左边存在键
        if (y-1>=0&&keyboard[x][y-1]!=-1){
            answerlist.add(keyboard[x][y-1]+"");
        }
        //右边存在键
        if (y+1<=2&&keyboard[x][y+1]!=-1){
            answerlist.add(keyboard[x][y+1]+"");
        }
        return answerlist;
    }

    public static void main(String[] args) {
        System.out.println(getPINS("11111"));
    }
}