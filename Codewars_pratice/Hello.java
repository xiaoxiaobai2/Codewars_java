package Codewars_pratice;

public class Hello {
    public static String Tickets(int... peopInLine){
        int[] tag=new int[]{0,0};//tag[0]存储25元的张数，tag[1]存储50元的张数
        for (int n:peopInLine){
            switch (n){
                case 25:tag[0] ++;
                break;
                case 50:if (tag[0]>0){
                    tag[0]--;
                    tag[1]++;
                }else {
                    return "NO";
                }
                break;
                case 100:if(tag[1]>0&&tag[0]>0){
                    tag[0]--;tag[1]--;
                }else if(tag[0]>=3){
                    tag[0] -=3;
                }else {
                    return "NO";
                }
                break;
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(Tickets(new int[]{25, 100}));
    }
}
