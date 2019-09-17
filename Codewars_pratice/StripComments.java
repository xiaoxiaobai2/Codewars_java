package Codewars_pratice;

import java.lang.reflect.Type;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        String answer="";
        char[] chars=text.toCharArray();
        boolean remove=false;//判断是否属于注释后的字符
        for (char c:chars){
            //不是注释后的字符需要检查是否出现注释符号
            if (remove==false){
                for (int i=0;i<commentSymbols.length;i++){
                    if (c==commentSymbols[i].charAt(0)){
                        remove=true;
                        break;
                    }
                }
                //不是注释内的字符且不是注释符号，附加在answer后面
                if (remove==false){
                    answer +=c;
                    if (c==91)
                        answer+='\n';
                }

            }else if (c=='\n'){
                //新的一行开始  存入换行符，并且将remove 置位false
                answer +=c;
                if (c==91)
                    answer+='\n';
                remove =false;
            }
        }
        //去除每行后的空格符
        String[] s = answer.split("\n");
        answer = "";
        for (int i=0;i<s.length;i++){
            int j;
            for (j=s[i].length()-1;j>=0;j--)
                if (s[i].charAt(j)!=' ')
                    break;
            answer +=s[i].substring(0,j+1)+"\n";
        }
        return answer.substring(0,answer.length()-1);
    }

    public static void main(String[] args) {
        String s="abcd";
        String[] x={"#", "$"};
        System.out.println(stripComments("a #b\nc\n[\n][]d $e f g",x));
        char c=91;
        System.out.println(c);
    }
}
