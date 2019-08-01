package Test;
/**
  * @author:  Zhang
  * @description:
  *
  *
 **/
public class DontKnowLength {
    public static void main(String[] args) {
        test(1,2,3);
    }

    static void test(int... ids){
        System.out.print(ids.length);
        for(int id:ids){
            System.out.print(id);
        }
        char c=49;
        int x=1;
        System.out.println(c==x+48);

    }
}
