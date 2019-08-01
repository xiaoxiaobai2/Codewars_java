package Codewars_pratice;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
    public static String order(String word){
        char[] chars=word.toCharArray();
        int n = 1;//统计一句话里单词的数量
        String str = "";//返回的内容
        if (chars.length == 0){
            n=0;
        }
        else {
            for (char c:chars) {
                if (c==32){
                    n++;
                }
            }
//            System.out.printf("单词个数 %d",n);

            for (int j=1;j<=n;j++) {
                for (int i=0;i<chars.length;i++){
                    if(chars[i]==48+j){
                        while(i>=0&&chars[i]!=32){
                            i--;
                        }
                        i++;
                        while (i<chars.length&&chars[i]!=32){
                            str = str+chars[i];
                            i++;
                        }
                        str +=" ";
                        break;
                    }
                }
            }
            str = str.substring(0,str.length()-1);
        }
        System.out.println(str);
        return str;
    }
    public static String order_(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }
    public static void main(String[] args) {
        System.out.println(order_("4of Fo1r pe6ople g3ood th5e the2"));
    }
}
