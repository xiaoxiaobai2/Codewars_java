package Codewars_pratice;

public class SimplePigLatin {
    public static String pigIt(String str){
        String sentences="";//将要返回的句子
        String[] words = str.split(" ");
        for (String word:words) {
            //判断分词不是标点符号
            char[] c =word.toCharArray();
            char last = c[c.length-1];
            //
            if((c[0]>=65&&c[0]<=90)||(c[0]>=97&&c[0]<=122))
                //最后一个字符为标点符号，则将标点符号补充在最后面
                if (!((last>=65&&last<=90)||(last>=97&&last<=122))){
                    word = word.substring(1,word.length()-1) + word.substring(0,1) + "ay" +last;
                }else word = word.substring(1) + word.substring(0,1) + "ay";

            sentences +=word + " ";
        }
        //去除最后一个空格
        sentences = sentences.trim();
        return sentences;
    }
    public static String pigIt_(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
    }
}
