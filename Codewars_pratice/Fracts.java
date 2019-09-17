package Codewars_pratice;

public class Fracts {
    public static String convertFrac(long[][] lst) {
        //将所有数化为最简分数
        String answer="";
        if (lst.length==0)
            return answer;
        for (int i=0;i<lst.length;i++){
            long k=2;
            long j=lst[i][0];
            while (k<=j){
                j=lst[i][0];
                k=2;
                while (k<=j){
                    //约分，直到无法再约
                    if (lst[i][0]%k==0&&lst[i][1]%k==0){
                        lst[i][0] = lst[i][0]/k;
                        lst[i][1] = lst[i][1]/k;
                        break;
                    }
                    k++;
                }
            }
        }
        //找所有分母的最小公倍数
        long total_yushu=1;
        long m=lst[0][1];
        while (!(total_yushu==0)){
            total_yushu =0;
            for (int i=0;i<lst.length;i++)
                total_yushu +=m%lst[i][1];
            m ++;
        }
        m--;//去掉最后一词++
        //获得结果
        for (int i=0;i<lst.length;i++)
        {
            long k = m/lst[i][1];
            answer +="(" + lst[i][0] *k +"," +lst[i][1] *k + ")";
        }
        return answer;
    }

    public static void main(String[] args) {
        long[][] lst = new long[][] {};
        System.out.println(convertFrac(lst));
//        System.out.println();
    }
}
