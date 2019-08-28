package Codewars_pratice;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        String answer;
        //求时
        int hh=seconds/(60*60);
        seconds =seconds%(60*60);
        //求分
        int mm=seconds/60;
        seconds = seconds%60;
        //求秒
        int ss=seconds;
        //转为String类型
        String HH=hh+"";
        String MM=mm+"";
        String SS=ss+"";
//        System.out.println("时：" + hh);
//        System.out.println("分：" + mm);
//        System.out.println("秒：" + ss);
        //一位数字则补一个0否则返回原值，时分后加上：
        HH = HH.length()==1? 0 +HH + ":":HH+":";
        MM = MM.length()==1? 0 +MM+":":MM+":";
        SS = SS.length()==1? 0 +SS:SS;
        answer = HH + MM +SS;
        return answer;
    }

    public static String makeReadable_(int seconds) {
        return String.format("%02d:%02d:%02d", seconds/3600, seconds%3600/60, seconds%60);
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(86399));
    }
}
