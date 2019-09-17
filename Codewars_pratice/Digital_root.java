package Codewars_pratice;

public class Digital_root {
    public static int digital_root(int n){
        int x=0;//将要返回的结果
        while (n>=10){
            x=0;//重置待返回数
            while (n>0){
                x +=n%10;//取余累加
                n = n/10;//去除个位
            }
            n=x;//将得数置为新的n,知道得数为自然数
        }
        return x;
    }

    public static int digital_root_(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;//各位数之和为该数对9取余
    }

    public static void main(String[] args) {
        System.out.println(digital_root(493193));
    }
}
