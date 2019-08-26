package sorted;

import java.util.Arrays;

public class MP_paixu {
    public static void main(String[] args) {
        int[] a = {9,5,6,8,2,4,3,1,7};
        int temp;
        boolean sorted = true;
        for(int i=0;i<a.length-1;i++){
            sorted = true;
            for (int j=0;j<a.length-1-i;j++)
                if (a[j+1]>a[j]){
                    sorted=false;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            if (sorted==true)break;
        }
        System.out.println("冒泡排序对“9,5,6,8,2,4,3,1,7”进行排序：");
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+ ",");
        System.out.println("Arrays.tostring()方法输出数组：");
        System.out.println(Arrays.toString(a));

    }
}
