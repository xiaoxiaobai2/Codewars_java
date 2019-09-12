import java.lang.reflect.Array;
import java.util.Arrays;

public class Spiralizor {
    public static int[][] spiralize(int size) {
        //初始化地图
        int[][] ans=new int[size][size];
        for (int i=0;i<size;i++)
            for (int j=0;j<size;j++)
                ans[i][j]=1;
        int i=1,j=0;//起始点

        /**
         * 注意每次判断时   当前点的下下一个为空或等于0，且下一个部位0
         *              这里面判断之后，当前点还可以走，但是需要下一步去执行，
         *              所以在结束前，break 语句之前还要在走一次
         */
        while(true){
            //向右走，下个不是0，且下下不为1或越界
            if (j+2<size&&ans[i][j+1]!=0&&ans[i][j+2]!=0)
            {
                while(j+2<size&&ans[i][j+1]!=0&&ans[i][j+2]!=0) {
                    ans[i][j]=0;
                    j++;
                }
            }
            else {
                ans[i][j]=0;
                break;
            }

            //
            // 向下走，下个不是0，且下下不为1或越界
            if (i+2<size&&ans[i+1][j]!=0&&ans[i+2][j]!=0)
            {
                while(i+2<size&&ans[i+1][j]!=0&&ans[i+2][j]!=0){
                    ans[i][j]=0;
                    i++;
                }
            } else {
                ans[i][j]=0;
                break;
            }

            //向左走，下个不是0，且下下不为1或越界
            if (j-2>-1&&ans[i][j-1]!=0&&ans[i][j-2]!=0){
                while(j-2>-1&&ans[i][j-1]!=0&&ans[i][j-2]!=0){
                    ans[i][j]=0;
                    j--;
                }
            }else {
                ans[i][j]=0;
                break;
            }

            //向上走，下个不是0，且下下不为1或越界
            if (i-2>-1&&ans[i-1][j]!=0&&ans[i-2][j]!=0)
            {
                while(i-2>-1&&ans[i-1][j]!=0&&ans[i-2][j]!=0) {
                    ans[i][j]=0;
                    i--;
                }
            }else {
                ans[i][j]=0;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int size=5;
        int[][] ints=spiralize(size);
        for (int i=0;i<size;i++)
            System.out.println(Arrays.toString(ints[i]));
    }
}
