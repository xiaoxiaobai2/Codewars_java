package Codewars_pratice;

public class PangramCheck {
    public static boolean check(String sentence){
        char[] chars=sentence.toCharArray();
        //标记为，判断该字母是否出现过
        int[] tags =new int[26];
        //初始化
        for (int tag:tags){
            tag=0;
        }
        for (char c:chars){
            //大写字母
            if(c<=90&&c>=65){
                tags[c-65] +=1;
                continue;
            }
            //小写字母
            if (c<=122&&c>=97){
                tags[c-97] +=1;
                continue;
            }
        }
        for (int tag:
             tags) {
            if (tag==0){
                return false;
            }
        }
//        System.out.println(tags);
        return true;
    }
    public boolean check_(String sentence){
        for (char c = 'a'; c<='z'; c++)
            if (!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

    }
    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
    }
}
