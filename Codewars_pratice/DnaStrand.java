package Codewars_pratice;

public class DnaStrand {
    /**
     * @author:  Zhang
     * @description:
     * 找出一个整数数组中的异常
     * 偶数数组返回唯一的奇数odd
     * 奇数数组返回位子的偶数even
     *
    **/
    public static int makeComplement(int[] integers) {
        int odd = 0;//统计奇数个数
        int even = 0;//统计偶数个数
        int N=0;
        // 先判断奇数多还是偶数多
        for(int i = 0;i<3;i++){
            switch(integers[i] %2){
                case 0: even++;
                break;
                case 1: odd++;
                break;
                case -1:odd +=1;
                break;
            }
        }
        System.out.println("odd:" +odd);
        System.out.println("even:" +even);
        if(even>odd){
            for(int i=0;i<integers.length;i++){
                if (integers[i]%2 == 1||integers[i]%2==-1){
                    N = integers[i];
                    break;
                }
            }
        }
        else {
            for(int i=0;i<integers.length;i++){
                if (integers[i]%2 == 0){
                    N = integers[i];
                    break;
                }
            }
        }
        return N;

    }

    public static void main(String[] args) {
        int[] exampleTest1 = {2,6,8,-10,3};
        System.out.println(makeComplement(exampleTest1));
    }
}
